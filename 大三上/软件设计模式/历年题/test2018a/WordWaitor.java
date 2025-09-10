package test2018a;


import java.util.ArrayList;

/**
 * <h3>Design Patterns</h3>
 *
 * @author : 小程
 * @description :
 * @date : 2023-10-28 20:50
 **/

public class WordWaitor {
    private ArrayList<Command> commands;//可以持有很多的命令对象

    public WordWaitor() {
        commands = new ArrayList();
    }

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    public void orderUp() {
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }



}
