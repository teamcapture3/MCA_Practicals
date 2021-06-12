using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication5
{
    public partial class Form1 : Form
    {
        Boolean p1, p2;
        public Form1()
        {
            InitializeComponent();
            start();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (button1.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button1.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button1.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (button2.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button2.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button2.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (button3.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button3.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button3.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (button4.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button4.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button4.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            if (button5.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button5.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button5.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (button6.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button6.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button6.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (button7.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button7.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button7.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (button8.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button8.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button8.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }

        private void button9_Click(object sender, EventArgs e)
        {
            if (button9.Text == "")
            {
                if (p1 == true)
                {
                    label2.ForeColor = Color.Green;
                    button9.Text = "X";
                    p1 = false;
                    p2 = true;
                    label2.Text = "Player 2";
                }
                else
                {
                    label2.ForeColor = Color.Red;
                    button9.Text = "O";
                    p1 = true;
                    p2 = false;
                    label2.Text = "Player 1";
                }
            }
            finished();
        }
        void finished()
        {
            if ((button1.Text == "X" && button2.Text == "X" && button3.Text == "X") ||
                (button1.Text == "X" && button4.Text == "X" && button7.Text == "X") ||
                (button1.Text == "X" && button5.Text == "X" && button9.Text == "X") ||
                (button3.Text == "X" && button5.Text == "X" && button7.Text == "X") ||
                (button2.Text == "X" && button5.Text == "X" && button8.Text == "X") ||
                (button3.Text == "X" && button6.Text == "X" && button9.Text == "X") ||
                (button4.Text == "X" && button5.Text == "X" && button6.Text == "X") ||
                (button7.Text == "X" && button8.Text == "X" && button9.Text == "X"))
            {
                MessageBox.Show("Winner is : Player 1");
                start();
            }
            else if ((button1.Text == "O" && button2.Text == "O" && button3.Text == "O") ||
                (button1.Text == "O" && button4.Text == "O" && button7.Text == "O") ||
                (button1.Text == "O" && button5.Text == "O" && button9.Text == "O") ||
                (button3.Text == "O" && button5.Text == "O" && button7.Text == "O") ||
                (button2.Text == "O" && button5.Text == "O" && button8.Text == "O") ||
                (button3.Text == "O" && button6.Text == "O" && button9.Text == "O") ||
                (button4.Text == "O" && button5.Text == "O" && button6.Text == "O") ||
                (button7.Text == "O" && button8.Text == "O" && button9.Text == "O"))
            {
                MessageBox.Show("Winner is : Player 2");
                start();
            }
            else if (button1.Text != "" && button2.Text != "" && button3.Text != ""
                && button4.Text != "" && button5.Text != "" && button6.Text != ""
                && button7.Text != "" && button8.Text != "" && button9.Text != "")
            {
                MessageBox.Show("Its a tie");
                start();
            }
        }
        public void start()
        {
            button1.Text = "";
            button2.Text = "";
            button3.Text = "";
            button4.Text = "";
            button5.Text = "";
            button6.Text = "";
            button7.Text = "";
            button8.Text = "";
            button9.Text = "";
            label2.Text = "Player 1";
            label2.ForeColor = Color.Red;
            p1 = true;
            p2 = false;
        }

        private void button11_Click(object sender, EventArgs e)
        {
            start();
        }
    }
}

