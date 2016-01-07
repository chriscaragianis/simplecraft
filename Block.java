class Block {

  private int xPos;
  private int yPos;
  private double durability;
  private static int blockCount;

  //This is a public 'setter' (or 'mutator' if you want to be
  //fancy).  It allows us a public interface for changing the
  //private data in the Block object.  This is a very simple
  //example, but setters can contain any program logic we like.
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

  //This toString method *overrides* the toString method
  //that Block *inherits* from the class Object.  All user
  //created classes are subclasses of Object, and get to use
  //all Object methods, including toString.
  //
  //In our case, we don't want the Object version of toString.
  //We need a toString method specific to Block objects.
  //Therefore we redefine (or override) toString here.
  public String toString() {
    double durabilityPercent = durability * 100;
    String line1 = "Block at (" + xPos + ", " + yPos + ")\n";
    String line2 = "Durability: " + durabilityPercent + "%\n";
    return line1 + line2;
  }
}
