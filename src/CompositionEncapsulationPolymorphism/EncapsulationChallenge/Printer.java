package CompositionEncapsulationPolymorphism.EncapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel >-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
