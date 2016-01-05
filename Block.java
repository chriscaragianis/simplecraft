class Block {

  private int xPos;
  private int yPos;
  private double durability;
  private static int blockCount;

  public void setXPos(int newX) {
    //SAFELY alters the xPos variable
    xPos = newX;
  }
  public void blockTest() {
    System.out.println(
      "I AM A BLOCK AT " + xPos + "!");
  }
}
