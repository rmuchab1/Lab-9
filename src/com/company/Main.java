package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static sun.security.x509.PolicyInformation.ID;

public class Main {

    public static void main(String[] args) {
        try {
            NullPointer.Error();
        } catch (NullPointerException e) {
            e.getMessage();
        }

        try {
            ThrowError.Error();
        } catch (ArrayIndexOutOfBoundsException arr) {
            arr.getMessage();
        } finally {
            System.out.println("Finally block has been run already");
        }

        int withdraw = 20001, balance = 20000;
        Account acc = new Account(balance, "Tony", ID);
        try {
            if (balance >= withdraw)
                acc.Cal(withdraw);
            else
                throw new NotEnoughMoney();
        } catch (NotEnoughMoney e) {
            System.out.println(e.getMessage());
        } finally {
            acc.Cal(withdraw);
        }
        public static void main (String[]args) throws LoginFailed, CapchaFailed,
                PaymentFailed, NumberFormatException, IOException {

            String username = "James", password = "123", capcha = "cat",
                    userInput, passInput, capInput;
            int payment, goods = 350;
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.print("Username: ");
                userInput = BR.readLine();
                System.out.print("Password: ");
                passInput = BR.readLine();
                System.out.print("Capcha: ");
                capInput = BR.readLine();

                if (!userInput.equals(username) || !passInput.equals(password)) {
                    throw new LoginFailed();
                }
                if (!capInput.equals(capcha)) {
                    throw new CapchaFailed();
                } else {
                    System.out.print("Payment: ");
                    payment = Integer.parseInt(BR.readLine());
                    if (payment < goods) {
                        throw new PaymentFailed();
                    }
                }

                Success.loginMessage(username);
                Success.paymentMessage(payment, goods);
            } catch (LoginFailed | CapchaFailed | PaymentFailed e) {
                System.out.println(e.getMessage());
            }

            public static void main(String[] args) throws SecurityException, IOException,
                    ThrowError1, ThrowError2 {

                try {
                    globalUse.Use();
                    throw new ThrowError1();
                } catch (ThrowError1 e) {
                    System.out.println(e.getMessage());
                }

                try {
                    globalUse.Use();
                    throw new ThrowError2();
                } catch (ThrowError2 e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        }
    }