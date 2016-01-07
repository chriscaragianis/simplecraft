import java.util.ArrayList;

class Client {

  private ArrayList<Block> blockList;

  public Client() {
    blockList = new ArrayList<Block>();
  }

  public void addToBlockList(Block block) {
    blockList.add(block);
  }

  public void printBlockList() {
    for (Block block : blockList) {
      System.out.println(block.toString());
    }
  }
}
