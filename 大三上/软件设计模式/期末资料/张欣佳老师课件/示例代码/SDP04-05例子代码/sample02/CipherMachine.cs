using System;  
using System.Text;  
  
namespace FacadeSample  
{  
    class CipherMachine  
    {  
       public string Encrypt(string plainText)   
       {  
       Console.Write("���ݼ��ܣ�������ת��Ϊ���ģ�");  
       string es = "";  
            char[] chars = plainText.ToCharArray();  
       foreach(char ch in chars)   
            {  
                string c = (ch % 7).ToString();  
           es += c;  
       }  
            Console.WriteLine(es);  
       return es;  
    }  
    }  
}  