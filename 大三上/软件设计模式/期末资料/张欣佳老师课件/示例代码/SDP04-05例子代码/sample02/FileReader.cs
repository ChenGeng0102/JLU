using System;  
using System.Text;  
using System.IO;  
  
namespace FacadeSample  
{  
    class FileReader  
    {  
        public string Read(string fileNameSrc)   
        {  
       Console.Write("��ȡ�ļ�����ȡ���ģ�");  
            FileStream fs = null;  
            StringBuilder sb = new StringBuilder();  
       try  
            {  
                fs = new FileStream(fileNameSrc, FileMode.Open);  
                int data;  
               while((data = fs.ReadByte())!= -1)   
                {  
            sb = sb.Append((char)data);  
               }  
               fs.Close();  
               Console.WriteLine(sb.ToString());  
       }  
       catch(FileNotFoundException e)   
            {  
           Console.WriteLine("�ļ������ڣ�");  
       }  
       catch(IOException e)   
            {  
           Console.WriteLine("�ļ���������");  
       }  
       return sb.ToString();  
        }  
    }  
}  