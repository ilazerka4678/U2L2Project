public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(150,200 );
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();
        rect1.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);
        int rect1Perimeter = (rect1.getWidth() * 2) + (rect1.getLength() * 2);
        int rect2Perimeter = (rect2.getWidth() * 2) + (rect2.getLength() * 2);
        int rect3Perimeter = (rect3.getWidth() * 2) + (rect3.getLength() * 2);
        int perimeterTotal = rect1Perimeter + rect2Perimeter + rect3Perimeter;
        int rect1Area = rect1.getWidth() * rect1.getLength();
        int rect2Area = rect2.getWidth() * rect2.getLength();
        int rect3Area = rect3.getWidth() * rect3.getLength();
        int areaTotal = rect1Area + rect2Area + rect3Area;

    }
}
