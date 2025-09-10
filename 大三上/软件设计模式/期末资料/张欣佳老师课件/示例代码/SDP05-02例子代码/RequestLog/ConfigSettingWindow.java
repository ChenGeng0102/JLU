//�����ļ����ô����ࣺ��������  
class ConfigSettingWindow {  
    //����һ���������洢ÿһ�β���ʱ���������  
    private ArrayList<Command> commands = new ArrayList<Command>();  
    private Command command;   
  
    //ע������������  
    public void setCommand(Command command) {  
        this.command = command;  
    }  
      
    //ִ�������ļ��޸����ͬʱ�����������ӵ��������  
    public void call(String args) {  
        command.execute(args);  
        commands.add(command);  
    }  
      
    //��¼������־��������־�ļ����������д����־�ļ�  
    public void save() {  
        FileUtil.writeCommands(commands);  
    }  
      
    //����־�ļ�����ȡ����ϣ���ѭ������ÿһ����������execute()������ʵ�������ļ�����������  
    public void recover() {  
        ArrayList list;  
        list = FileUtil.readCommands();  
          
        for (Object obj : list) {  
            ((Command)obj).execute();  
        }  
    }  
}  
