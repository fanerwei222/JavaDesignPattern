

## 命令模式(行为型模式（6/11种）)

#### 命令模式组成
	
	1个命令抽象类Cmd;Cmd中有1个命令实际执行对象和1个执行命令方法;
	1个实际命令抽象类的实现类;实现方法中执行父类实际执行对象的方法;
	1个工作人员WorkMan抽象类;WorkMan中有工作方法;
	1个程序员类,继承于WorkMan;实现了具体的方法;
	1个小领导,里面有一个Cmd和执行Cmd的方法;
	
	具体执行 ： 
		领导下发一个命令-->Command command = new Command();
		此时需要一个小领导-->LittleLead lead = new LittleLead();
		小领导接收命令-->lead.setCommand(command);
		小领导执行命令-->lead.action();
	
	
