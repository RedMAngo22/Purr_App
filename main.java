

public class txtdemo extends Applet

{
TextField txt1 = new TextField(25);
TextField passtxt1 = new TextField(10);
TextField txt2 = new TextField(25);
TextField passtxt2 = new TextField(10);
Button button1=new Button("after entering press");


public void init()
{
add(txt1)
add(txt2);
passtxt1.setEchoCharacter('*');
add(passtxt1);
passtxt2.setEchoCharacter('*');
add(passtxt2);
add(button1);
}

public boolean action(Event evt,Object obj)
{
if (evt.target ==txt1) 
{
txt2.setText(txt1.getText());
return true;
}
if (evt.target == passtxt1)
{
passtxt2.setText(passtxt1.getText());
return true;
}

}
}
