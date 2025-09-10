namespace FacadeSample  
{  
    class EncryptFacade  
    {  
        //ά�ֶ��������������  
         private FileReader reader;  
        private CipherMachine cipher;  
        private FileWriter writer;  
  
        public EncryptFacade()  
        {  
            reader = new FileReader();  
            cipher = new CipherMachine();  
            writer = new FileWriter();  
        }  
  
        //�������������ҵ�񷽷�  
         public void FileEncrypt(string fileNameSrc, string fileNameDes)  
        {  
            string plainStr = reader.Read(fileNameSrc);  
            string encryptStr = cipher.Encrypt(plainStr);  
            writer.Write(encryptStr, fileNameDes);  
        }  
    }  
}  