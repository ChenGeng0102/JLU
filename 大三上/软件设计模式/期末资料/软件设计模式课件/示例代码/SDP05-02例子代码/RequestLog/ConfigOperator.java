//�����ļ������ࣺ��������ߡ�����ConfigOperator��Ķ�����Command�ĳ�Ա������Ҳ����Command����һ��д���ļ������ConfigOperatorҲ��Ҫʵ��Serializable�ӿ�  
class ConfigOperator implements Serializable {  
    public void insert(String args) {  
        System.out.println("�����½ڵ㣺" + args);  
    }  
      
    public void modify(String args) {  
        System.out.println("�޸Ľڵ㣺" + args);  
    }  
      
    public void delete(String args) {  
        System.out.println("ɾ���ڵ㣺" + args);  
    }  
}  