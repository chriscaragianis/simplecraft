import java.util.ArrayList;

class Client {

  //This is an instance variable.  Every instance of the
  //Client class has its own 'blockList'.
  //
  //The access on this instance variable is set to 'private',
  //which means only Client objects can access it.
  private ArrayList<Block> blockList;

  //This is a constructor.  A constructor is called every time
  //an instance of a class is created. This constructor
  //initializes the instance variable "blockList" to a new
  //ArrayList object
  public Client() {
    blockList = new ArrayList<Block>();
  }

  //This is a public instance method.  This method can be
  //called anywhere in our code by 'asking' a particular
  //client object to run it.
  //
  //Example:
  //  myClient = new Client();
  //  myClient.addToBlockList(myBlock);
  //          ^
  //    (this dot operator says 'hey myClient, go ahead and
  //     run your addToBlockList method')
  public void addToBlockList(Block block) {
    blockList.add(block);
  }

  public void printBlockList() {
    for (Block block : blockList) {
      System.out.println(block.toString());
    }
  }
}
