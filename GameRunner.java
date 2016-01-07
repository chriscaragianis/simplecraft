class GameRunner {

  //Any class that conatins a "main" method is
  //a *program*.  When you invoke "java GameRunner"
  //from the command line, java looks in the GameRunner
  //class for a main method.
  //
  //When it finds a main method, java executes that code
  //line by line.  The main method sets our system in motion.
  public static void main(String[] args){

    //Create a new Client object by calling a
    //no-argument constructor
    Client myClient = new Client();

    //Create two new Block objects by calling a
    //no-argument constructor
    Block block1 = new Block();
    Block block2  = new Block();

    //"Hey myClient, take this block1 object and
    // run 'addToBlockList' on it!"
    myClient.addToBlockList(block1);
    myClient.addToBlockList(block2);

    //"Hey myClient, go ahead and run your printBlockList
    // method!"
    myClient.printBlockList();
  }
}
