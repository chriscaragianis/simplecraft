class GameRunner {

  public static void main(String[] args){
    Client myClient = new Client();
    Block block1 = new Block();
    Block block2  = new Block();

    myClient.addToBlockList(block1);
    myClient.addToBlockList(block2);

    myClient.printBlockList();
  }
}
