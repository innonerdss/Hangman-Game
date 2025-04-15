    System.out.println("Welcome to ATM Machine!");

    do {
        System.out.println("\n1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose Option: ");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Your Balance: $" + user.checkBalance());
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double dep = sc.nextDouble();
                user.deposit(dep);
                System.out.println("Deposit Successful.");
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double wit = sc.nextDouble();
                if(user.withdraw(wit)) {
                    System.out.println("Withdrawal Successful.");
                } else {
                    System.out.println("Insufficient Balance.");
                }
                break;
            case 4:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    } while(choice != 4);
}
