//象棋棋子备忘录类：备忘录  
class ChessmanMemento {  
    private String label;  
    private int x;  
    private int y;  
  
    public ChessmanMemento(String label,int x,int y) {  
        this.label = label;  
        this.x = x;  
        this.y = y;  
    }  
  
    public void setLabel(String label) {  
        this.label = label;   
    }  
  
    public void setX(int x) {  
        this.x = x;   
    }  
  
    public void setY(int y) {  
        this.y = y;   
    }  
  
    public String getLabel() {  
        return (this.label);   
    }  
  
    public int getX() {  
        return (this.x);   
    }  
  
    public int getY() {  
        return (this.y);   
    }     
}  