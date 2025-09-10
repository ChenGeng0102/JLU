//配置文件操作类：请求接收者。由于ConfigOperator类的对象是Command的成员对象，它也将随Command对象一起写入文件，因此ConfigOperator也需要实现Serializable接口  
class ConfigOperator implements Serializable {  
    public void insert(String args) {  
        System.out.println("增加新节点：" + args);  
    }  
      
    public void modify(String args) {  
        System.out.println("修改节点：" + args);  
    }  
      
    public void delete(String args) {  
        System.out.println("删除节点：" + args);  
    }  
}  