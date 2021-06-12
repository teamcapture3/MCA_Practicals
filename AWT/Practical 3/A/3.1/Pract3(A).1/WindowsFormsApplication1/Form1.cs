using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace textfile
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void button1_Click(object sender, EventArgs e)
        {
            using (StreamWriter sw = new StreamWriter("E:\\file.txt"))
            {
                string w = richTextBox1.Text;
                sw.Write(w);
                if (File.Exists("E:\\file.txt"))
                {
                    label3.Text = "File write successfully";
                }
                else
                {
                    label3.Text = "Failed to write a file";
                }
            }
        }
        private void button2_Click(object sender, EventArgs e)
        {
            if (File.Exists("E:\\file.txt"))
            {
                using (StreamReader sr = new StreamReader("E:\\file.txt"))
                {
                    richTextBox1.Clear();
                    string line = sr.ReadToEnd();
                    richTextBox1.Text = line;
                    label3.Text = "File read successfully";
                }
            }
            else
            {
                label3.Text = "Failed to read a file";
            }
        }
        FileStream fs = new FileStream("E:\\file.bin", FileMode.Create, FileAccess.Write);
        private void button3_Click(object sender, EventArgs e)
        {
            /*if (string.IsNullOrEmpty(richTextBox1.Text))
                return;
            int charCount = richTextBox1.Text.Length;
            byte[] bytes = new byte[charCount];
            string[] byteStrings = new string[charCount];
            StreamWriter sw = new StreamWriter("E:\\test1.txt", true);
            int i = 0;
            foreach (char c in richTextBox1.Text)
            {
                try
                {
                    bytes[i] = Convert.ToByte(c);
                    byteStrings[i] = Convert.ToString(bytes[i], 2).PadLeft(8, '0');
                }
                catch
                {
                    bytes[i] = Encoding.UTF8.GetBytes(c.ToString().ToCharArray())[i];
                    byteStrings[i] = Convert.ToString(bytes[i], 2).PadLeft(24, '0');
                }
                sw.WriteLine("Character \"" + c.ToString() + "\" bits as ones and zeros: " + byteStrings[i]);
                i++;
                label3.Text = "File write successfully";
            }
            sw.Close();*/
            BinaryWriter bw = new BinaryWriter(fs);
            bw.Write(richTextBox1.Text);
            bw.Close();
            MessageBox.Show("File write successfully");
        }
        private void button4_Click(object sender, EventArgs e)
        {
            /*if (File.Exists("E:\\test1.txt"))
            {
                using (StreamReader sr = new StreamReader("E:\\test1.txt"))
                {
                    richTextBox1.Clear();
                    string line = sr.ReadToEnd();
                    richTextBox1.Text = line;
                    label3.Text = "File read successfully";
                }
            }
            else
            {
                label3.Text = "Failed to read file";
            }*/
            if (File.Exists("E:\\file.txt"))
            {
                FileStream fs1 = new FileStream("E:\\file.bin", FileMode.Open);
                BinaryReader br = new BinaryReader(fs1);
                richTextBox1.Text = br.ReadString();
                MessageBox.Show("File read successfully");
            }
            else
            {
                MessageBox.Show("File not found");
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            richTextBox1.Clear();
        }
    }
}