package test2018a;

import javax.sound.midi.Receiver;

/**
 * <h3>Design Patterns</h3>
 *1.某台电脑上的 Word 文档有三种打开方式：
 * 桌面双击文档的图标打开、
 * 鼠标右键菜单选择打开方式Microsoft Office Word 打开、
 * Word 菜单命令打开。
 * 还有三种保存方式：
 * 点击"保存、
 * ctrl + s 保存，
 * 菜单命令保存。
 * 请为这六个操作编写代码，
 * 要求写出你所选择的设计模式，画出类图，并给出核心代码。
 *
 * @author : 小程
 * @description :
 * @date : 2023-10-28 20:20
 **/

//客户端
public class Client {
    public static void main(String[] args) {


        //创建接收者
        WordReceiver recever1=new MenuReceiver();
        WordReceiver recever2=new SaveHReceiver();

        //将订单和接收者封装成命令对象
        WordCommand cmd1 = new WordCommand(recever1);
        WordCommand cmd2 = new WordCommand(recever2);
        //创建调用者 waitor
        WordWaitor invoker = new WordWaitor();
        invoker.setCommand(cmd1);
        invoker.setCommand(cmd2);

        //将订单带到柜台 并向厨师喊 订单来了
        invoker.orderUp();
    }
}
