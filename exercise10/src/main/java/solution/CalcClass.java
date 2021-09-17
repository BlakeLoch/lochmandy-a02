package solution;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

public class CalcClass {
    /*
    method calcItem(price, quantity)
        return price * quantity
    method calcSubtotal(item1, item2, item3)
        return item1 + item2 * item3
    method calcTax(subtotal)
        return subtotal * TAX_RATE
    method calcTotal(subtotal, tax)
        return subtotal + tax

    method buildSubtotalOut(subtotal)
        return "Subtotal: $" + 'subtotal'
    method buildTaxOut(tax)
        return "Tax: $" + 'tax'
    method buildTotalOut(total)
        return "Total: $" + 'total'
     */

    public static final double TAX_RATE = 0.055;

    public double calcItem(double price, int quantity) {
        return price * quantity;
    }

    public double calcSubtotal(double item1, double item2, double item3) {
        return item1 + item2 + item3;
    }

    public double calcTax(double subtotal) {
        return subtotal * TAX_RATE;
    }


    public double calcTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public String buildSubtotalOut(double subtotal) {
        return "Subtotal: $" + String.format("%.2f", subtotal);
    }

    public String buildTaxOut(double tax) {
        return "Tax: $" + String.format("%.2f", tax);
    }

    public String buildTotalOut(double total) {
        return "Tax: $" + String.format("%.2f", total);
    }
}
