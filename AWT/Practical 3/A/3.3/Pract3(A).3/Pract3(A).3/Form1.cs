using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;

namespace serialize
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        Person p = new Person();
        IFormatter f = new BinaryFormatter();
        private string path = @"E:\\serialize.txt";
        private void button1_Click(object sender, EventArgs e)
        {
            p.ID = textBox1.Text;
            p.Name = textBox2.Text;
            Stream s = new FileStream(path, FileMode.OpenOrCreate, FileAccess.Write);
            f.Serialize(s, p);
            s.Close();
            label3.Text = "Successfully serialized data";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Stream s1 = new FileStream(path, FileMode.Open, FileAccess.Read);
            Person objnew = (Person)f.Deserialize(s1);
            if (objnew.ID == textBox1.Text)
            {
                listView1.Items.Add(objnew.Name + Environment.NewLine);
                label3.Text = "Successfully serched deserialized by ID";
            }
            else
            {
                label3.Text = "ID not found";
            }
        }
        [Serializable]
        class Person
        {
            public String ID;
            public String Name;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            listView1.Clear();
            textBox1.Clear();
            textBox2.Clear();
            label3.Text = " ";
        }
    }
}
