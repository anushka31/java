class Viewer 
{
 String channel="HBO";
void changeChannel()
{
channel="UTV";
}
void showChannel()
{
System.out.println(channel);

}
public static void main(String args[])
{
Viewer chries =new Viewer();
chries.changeChannel();
chries.showChannel();

Viewer shelly=new Viewer();
shelly.changeChannel();
shelly.showChannel();
}
}