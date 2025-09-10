using System;  
  
namespace FacadeSample  
{  
    class Program  
    {  
        static void Main(string[] args)  
        {  
            EncryptFacade ef = new EncryptFacade();  
            ef.FileEncrypt("src.txt", "des.txt");  
            Console.Read();  
        }  
    }  
}  