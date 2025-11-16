public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer{
    protected String model;
    protected int printedCount = 0;
    protected int availableCount = 0;
    public Printer(String model, int ac){
        this.model = model;
        this.availableCount = ac;
    }
    abstract public boolean print();
}

class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int ac){
        super(model, ac);
    }

    @Override
    public boolean print() {
        if (availableCount >= 1){
            printedCount++;
            availableCount--;
            return true;
        }
        else {
            System.out.printf("모델명: %s %d매째 인쇄 실패 - 잉크 부족.\n", model, printedCount+1);
            return false;
        }
    }
}

class LaserPrinter extends Printer{
    public LaserPrinter(String model, int ac){
        super(model, ac);
    }

    @Override
    public boolean print() {
        if (availableCount >= 1){
            printedCount++;
            availableCount--;
            return true;
        }
        else {
            System.out.printf("모델명: %s %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount+1);
            return false;
        }
    }
}
