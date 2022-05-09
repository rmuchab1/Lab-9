package com.company;

    class LoginFailed extends Exception {
        LoginFailed() {
            super("Invalid username or password.");
        }

        LoginFailed(String msg) {
            super(msg);
        }
    }

class CapchaFailed extends Exception {
    CapchaFailed() {
        super("capcha failed! Please try again.");
    }

    CapchaFailed(String msg) {
        super(msg);
    }
}

class PaymentFailed extends Exception {
    PaymentFailed() {
        super("Invalid payment.");
    }

    PaymentFailed(String msg) {
        super(msg);
    }
}

class Success {
    public static void loginMessage(String username) {
        System.out.println("Login successfully, welcome back " + username);
    }

    public static void paymentMessage(int payment, int price) {
        String result = payment >= price
                ? ("Payment successfully, your exchange is: " + Integer.toString(payment -= price)
                + ". Enjoy your shopping.")
                : null;
        System.out.println(result);
    }
}
