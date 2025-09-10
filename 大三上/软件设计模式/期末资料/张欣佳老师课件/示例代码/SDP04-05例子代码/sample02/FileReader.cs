using System;  
using System.Text;  
using System.IO;  
  
namespace FacadeSample  
{  
    class FileReader  
    {  
        public string Read(string fileNameSrc)   
        {  
       Console.Write("读取文件，获取明文：");  
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
           Console.WriteLine("文件不存在！");  
       }  
       catch(IOException e)   
            {  
           Console.WriteLine("文件操作错误！");  
       }  
       return sb.ToString();  
        }  
    }  
}  