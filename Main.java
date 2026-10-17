import java.util.*;


abstract class Bill {
    private int billId;
    private String patientName;
    protected double amount;

    
    Bill(int billId, String patientName) {
        this.billId = billId;
        this.patientName = patientName;
    }

    
    public int getBillId() { return billId; }
    public String getPatientName() { return patientName; }
    public double getAmount() { return amount; }

    
    abstract void calculateBill();

        void displayDetails() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Total Amount: " + amount);
    }
}


class ConsultationBill extends Bill {
    private double doctorFee;

    ConsultationBill(int billId, String patientName, double doctorFee) {
        super(billId, patientName);
        this.doctorFee = doctorFee;
    }

    @Override
    void calculateBill() {
        amount = doctorFee;
    }
}

class SurgeryBill extends ConsultationBill {
    private double operationCharges;

    SurgeryBill(int billId, String patientName, double doctorFee, double operationCharges) {
        super(billId, patientName, doctorFee);
        this.operationCharges = operationCharges;
    }

    @Override
    void calculateBill() {
        super.calculateBill(); // doctor fee
        amount += operationCharges;
    }
}

class PharmacyBill extends Bill {
    private double medicineCost;

    PharmacyBill(int billId, String patientName, double medicineCost) {
        super(billId, patientName);
        this.medicineCost = medicineCost;
    }

    @Override
    void calculateBill() {
        amount = medicineCost;
    }
}


class BillingRecords<T extends Bill> {
    private ArrayList<T> records = new ArrayList<>();

    void addRecord(T bill) {
        records.add(bill);
    }

    void showAllRecords() {
        for (T b : records) {
            b.calculateBill();
            b.displayDetails();
            System.out.println("-------------------");
        }
    }
}

 class Main {
    public static void main(String[] args) {

        BillingRecords<Bill> manager = new BillingRecords<>();

        Bill b1 = new ConsultationBill(1, "Ravi", 500);
        Bill b2 = new SurgeryBill(2, "Sita", 700, 2000);
        Bill b3 = new PharmacyBill(3, "Arjun", 300);

        manager.addRecord(b1);
        manager.addRecord(b2);
        manager.addRecord(b3);

        manager.showAllRecords();
    }
}