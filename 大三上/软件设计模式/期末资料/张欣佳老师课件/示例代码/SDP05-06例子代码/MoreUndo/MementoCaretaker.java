import java.util.*;  

//�������ӱ���¼�����ࣺ������
class MementoCaretaker {  
    //����һ���������洢�������¼  
    private ArrayList mementolist = new ArrayList();  
  
    public ChessmanMemento getMemento(int i) {  
        return (ChessmanMemento)mementolist.get(i);  
    }  
  
    public void setMemento(ChessmanMemento memento) {  
        mementolist.add(memento);  
    }  
}  