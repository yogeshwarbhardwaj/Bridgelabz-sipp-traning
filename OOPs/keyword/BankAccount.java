public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "Default Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final String accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName; // resolving ambiguity with this
        this.accountNumber = accountNumber; // final variable assigned once
        totalAccounts++;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to set bank name
    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Set bank name
        BankAccount.setBankName("Sider Bank");

        // Create accounts
        BankAccount account1 = new BankAccount("Alice", "123456");
        BankAccount account2 = new BankAccount("Bob", "654321");
        
        // Display total accounts
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        
        // Check with instanceof before displaying details
        Object obj = account1;
        if (obj instanceof BankAccount) {
            ((BankAccount) obj).displayAccountDetails();
        }
    }
}