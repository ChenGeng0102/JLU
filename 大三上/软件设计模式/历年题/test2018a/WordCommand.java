package test2018a;


/**
 * <h3>Design Patterns</h3>
 *
 * @author : 小程
 * @description :
 * @date : 2023-10-28 20:39
 **/


class WordCommand implements Command {
   public WordReceiver receiver;

    public WordCommand(WordReceiver receiver) {

        this.receiver = receiver;
    }


    public void execute() {

        receiver.openByDesktop();
    }
}