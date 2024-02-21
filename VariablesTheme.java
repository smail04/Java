public class VariablesTheme {
    public static void main(String[] args) {
        int cpuFrequency = 3000;
        int cpuCoresCount = 6;
        int ramAmountGb = 8;
        int ramMemoryFrequencyMhz = 1600;
        int ssdAmountGb = 240;
        int powerUnitWattage = 500;
        System.out.println("CPU Frequency: " + cpuFrequency + 
                "\nCPU Cores count: " + cpuCoresCount +
                "\nAmount of RAM, GB: " + ramAmountGb + 
                "\nRAM Memory Frequency: " + ramMemoryFrequencyMhz + 
                "\nAmount of SSD, GB: " + ssdAmountGb + 
                "\nPower Unit, watt: " + powerUnitWattage);
        System.out.println("");

        int penCost = 100;
        int bookCost = 200;
        int KitDiscountPercent = 11;
        int total = (penCost + bookCost);
        float kitDiscount = (total * (KitDiscountPercent / 100f));
        System.out.println("Total: " + total + 
                "\nKit discount " + KitDiscountPercent + "%: " + kitDiscount + 
                "\nTotal (discounted): " + (total - kitDiscount));
        System.out.println("");

        System.out.println("    J    a  V     v  a");
        System.out.println("    J   a a  V   V  a a");
        System.out.println("J   J  aaaaa  V V  aaaaa");
        System.out.println(" J J  a     a  V  a     a");
        System.out.println("");

        byte maxByteValue = Byte.MAX_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        int maxIntegerValue = Integer.MAX_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Max byte: " + maxByteValue +
                "\nMax short: " + maxShortValue + 
                "\nMax int: " + maxIntegerValue + 
                "\nMax long: " + maxLongValue+
                "\n++byte: " + ++maxByteValue +
                "\n++short: " + ++maxShortValue + 
                "\n++int: " + ++maxIntegerValue + 
                "\n++long: " + ++maxLongValue +
                "\n--byte: " + --maxByteValue +
                "\n--short: " + --maxShortValue + 
                "\n--int: " + --maxIntegerValue + 
                "\n--long: " + --maxLongValue);
        System.out.println("");

        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("Initial: a = " + a + " b = " + b);
        a = b;
        b = c;
        System.out.println("Third variable: a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Arithmetic: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = b ^ a;
        System.out.println("XOR: a = " + a + " b = " + b);
        System.out.println("");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + "\t" + dollar);
        System.out.println((int) asterisk + "\t" + asterisk);
        System.out.println((int) atSign + "\t" + atSign);
        System.out.println((int) verticalBar + "\t" + verticalBar);
        System.out.println((int) tilde + "\t" + tilde);
        System.out.println("");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);
        System.out.println("");

        int number = 456;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int units = number % 10; 
        System.out.println("Число " + number + " содержит: " + 
                "\n  сотен - " + hundreds + 
                "\n  десятков - " + tens + 
                "\n  единиц - " + units + 
                "\nСумма его цифр = " + (hundreds + tens + units) + 
                "\nПроизведение = " + (hundreds * tens * units));
        System.out.println("");

        int initialSeconds = 86399;
        int hours = initialSeconds / 3600;
        int minutes = initialSeconds % 3600 / 60;
        int seconds = initialSeconds % 60;
        System.out.println("" + hours + ":" + minutes + ":" + seconds);

    }
}
