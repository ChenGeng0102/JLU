//�����ࣺ�ļ�������  
class FileUtil {  
    //�������д����־�ļ�  
    public static void writeCommands(ArrayList commands) {  
        try {  
            FileOutputStream file = new FileOutputStream("config.log");  
            //����������������ڽ�����д�뵽�ļ���  
            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));  
            //������д���ļ�  
            objout.writeObject(commands);  
            objout.close();  
            }  
        catch(Exception e) {  
                System.out.println("�����ʧ�ܣ�");    
                e.printStackTrace();  
            }  
    }  
      
    //����־�ļ�����ȡ�����  
    public static ArrayList readCommands() {  
        try {  
            FileInputStream file = new FileInputStream("config.log");  
            //�����������������ڴ��ļ��ж�ȡ����  
            ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));  
              
            //���ļ��еĶ��������ת��ΪArrayList����  
            ArrayList commands = (ArrayList)objin.readObject();  
            objin.close();  
            return commands;  
            }  
        catch(Exception e) {  
                System.out.println("�����ȡʧ�ܣ�");  
                e.printStackTrace();  
                return null;      
            }         
    }  
}  