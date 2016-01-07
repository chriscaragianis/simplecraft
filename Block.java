class Block {

  private int xPos;
  private int yPos;
  private double durability;
  private static int blockCount;

  public void setXPos(int newX) {
    //SAFELY alters the xPos variable
    xPos = newX;
  }

  public void setYPos(int newY) {
    yPos = newY;
  }

  public void setPosition(int x, int y) {
    setXPos(x);
    setYPos(y);
  }

  public String toString() {
    double durabilityPercent = durability * 100;
    String line1 = "Block at (" + xPos + ", " + yPos + ")\n";
    String line2 = "Durability: " + durabilityPercent + "%\n";
    return line1 + line2;
  }
}
