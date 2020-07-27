package com.company.challenge;

public class Printer {
    private int tonerLevel = -1;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int addToner(int toner){
        if(toner > 0 && toner <= 100){
            if(this.tonerLevel + toner > 100){
                return -1;
            }
            this.tonerLevel += toner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int getPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
