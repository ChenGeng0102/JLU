using System;  
using System.IO;  
using System.Text;  
  
namespace FacadeSample  
{  
    class FileWriter  
    {  
        public void Write(string encryptStr,string fileNameDes)   
        {  
       Console.WriteLine("�������ģ�д���ļ���");  
            FileStream fs = null;  
       try  
            {  
               fs = new FileStream(fileNameDes, FileMode.Create);  
                byte[] str = Encoding.Default.GetBytes(encryptStr);  
                fs.Write(str,0,str.Length);  
                fs.Flush();  
               fs.Close();  
       }      
       catch(FileNotFoundException e)   
            {  
        Console.WriteLine("�ļ������ڣ�");  
       }  
       catch(IOException e)   
            {  
                Console.WriteLine(e.Message);  
           Console.WriteLine("�ļ���������");  
       }          
        }  
    }  
}