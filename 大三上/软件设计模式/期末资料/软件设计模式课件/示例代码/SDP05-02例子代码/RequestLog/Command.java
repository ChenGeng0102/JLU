import java.io.*;  
import java.util.*;  
  
//���������࣬������Ҫ���������д���ļ��������ʵ����Serializable�ӿ�  
abstract class Command implements Serializable {  
    protected String name; //��������  
    protected String args; //�������  
    protected ConfigOperator configOperator; //ά�ֶԽ����߶��������  
      
    public Command(String name) {  
        this.name = name;  
    }  
      
    public String getName() {  
        return this.name;  
    }  
      
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public void setConfigOperator(ConfigOperator configOperator) {  
        this.configOperator = configOperator;  
    }  
      
    //�������������ִ�з���execute()  
    public abstract void execute(String args);  
    public abstract void execute();  
}  
  
//���������ࣺ��������  
class InsertCommand extends Command {  
    public InsertCommand(String name) {  
        super(name);  
    }  
      
    public void execute(String args) {  
        this.args = args;  
        configOperator.insert(args);  
    }  
      
    public void execute() {  
        configOperator.insert(this.args);  
    }  
}  
  
//�޸������ࣺ��������  
class ModifyCommand extends Command {  
    public ModifyCommand(String name) {  
        super(name);  
    }  
      
    public void execute(String args) {  
        this.args = args;  
        configOperator.modify(args);  
    }  
      
    public void execute() {  
        configOperator.modify(this.args);  
    }  
}  
  
//ʡ����ɾ��������DeleteCommand  
  

  
