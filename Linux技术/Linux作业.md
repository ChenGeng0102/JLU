# 第一次作业

1、 在自己的计算机上，完成参考资料“LFS-on-openEuler_Lab-Guidebook”第2章openEuler操作系统的安装实验（注意：虚拟机上要创建两块虚拟硬盘，openEuler要安装最新的长周期版本openEuler-22.03-LTS-SP2）。

2、 在VirtualBox虚拟机上再安装个ubuntu-22.04.3系统。

3、 在虚拟机上启动openEuler系统并使用root账户登录。在命令行中先后执行“lsblk” 和 “uname -a” 命令后，对整个虚拟机截图，将图片保存为jpg格式，并命名为“Fig.1-openEuler-22.03”。

4、 在虚拟机上启动ubuntu-22.04.3系统并使用管理员账户登录，执行“uname -a” 命令后对整个虚拟机截图，将图片保存为jpg格式，并命名为“Fig.2-ubuntu-22.04”。

5、 根据附件中的参考资料，在openEuler中安装Posix man手册页,在命令行中执行
“man ls”命令后对整个虚拟机截图，将图片保存为jpg格式，并命名为“Fig.3-Posix-man”。

6、 根据附件中的参考资料，在openEuler中安装DDE图形桌面环境,然后对整个虚拟机截图，将图片保存为jpg格式，并命名为“Fig.4-DDE-Desktop”。

```
根据你的需求，这是完成这些任务的步骤：

1、在自己的计算机上安装openEuler-22.03-LTS-SP2：你可以从openEuler的官方网站下载最新的openEuler-22.03-LTS-SP2 ISO镜像文件。然后，你可以使用VirtualBox创建一个新的虚拟机，并在虚拟机的设置中添加两块虚拟硬盘。最后，你可以启动虚拟机，并在启动过程中选择刚刚下载的ISO镜像文件作为启动盘，按照屏幕上的提示完成openEuler的安装过程。

2、在VirtualBox虚拟机上安装ubuntu-22.04.3系统：你可以从Ubuntu的官方网站下载ubuntu-22.04.3的ISO镜像文件。然后，你可以在VirtualBox中创建一个新的虚拟机，并在虚拟机的设置中选择刚刚下载的ISO镜像文件作为启动盘。最后，你可以启动虚拟机，并按照屏幕上的提示完成Ubuntu的安装过程。

3、在虚拟机上启动openEuler系统并使用root账户登录：你可以在VirtualBox的虚拟机列表中选择你刚刚安装的openEuler虚拟机，然后点击“启动”按钮。在openEuler启动后，你可以使用root账户和你在安装过程中设置的密码登录系统。然后，你可以在命令行中执行lsblk和uname -a命令，并截图保存。

4、在虚拟机上启动ubuntu-22.04.3系统并使用管理员账户登录：你可以在VirtualBox的虚拟机列表中选择你刚刚安装的Ubuntu虚拟机，然后点击“启动”按钮。在Ubuntu启动后，你可以使用你在安装过程中设置的管理员账户和密码登录系统。然后，你可以在命令行中执行uname -a命令，并截图保存。

5、在openEuler中安装Posix man手册页：你可以在openEuler的命令行中执行以下命令来安装Posix man手册页：

sudo dnf install man-pages-posix

然后，你可以执行man ls命令，并截图保存。

6、在openEuler中安装DDE图形桌面环境：你可以在openEuler的命令行中执行以下命令来安装DDE图形桌面环境3：

sudo dnf update
sudo dnf install dde
sudo systemctl set-default graphical.target
sudo reboot

然后，你可以截图保存。
```

lsblk 是一个在 Linux 系统中常用的命令，它用于列出所有可用的块设备信息。块设备包括硬盘、分区、USB驱动器、SD卡等。

当你在终端中输入 lsblk 并按下回车键，它会显示一个列表，列出你的系统中所有的块设备，以及它们的大小、挂载点、文件系统类型等信息。

例如，它可能会显示类似以下的输出：

```
NAME   MAJ:MIN RM   SIZE RO TYPE MOUNTPOINT
sda      8:0    0 465.8G  0 disk 
├─sda1   8:1    0   512M  0 part /boot/efi
├─sda2   8:2    0   244M  0 part /boot
└─sda3   8:3    0 465.1G  0 part 
  ├─vg0-root 253:0    0    50G  0 lvm  /
  ├─vg0-swap 253:1    0   7.9G  0 lvm  [SWAP]
  └─vg0-home 253:2    0 407.2G  0 lvm  /home
```

这个输出告诉我们，系统中有一个名为 sda 的硬盘，它有三个分区（sda1、sda2 和 sda3）。每个分区的大小、类型和挂载点都列在了相应的列中。

lsblk 命令是一个非常有用的工具，可以帮助你理解你的系统的磁盘和分区结构。



uname -a 是一个在 Unix 和 Unix-like 操作系统中常用的命令，用于打印系统相关的信息。这个命令会显示以下信息：

内核名称（例如，Linux）
网络节点主机名
内核发行版本（例如，4.15.0-29-generic）
内核版本（例如，#31-Ubuntu SMP Tue Jul 17 15:39:52 UTC 2018）
机器硬件名称（例如，x86_64）
处理器类型
硬件平台
操作系统
-a 参数表示 “all”，意味着打印所有可用的系统信息。如果你在终端中运行 uname -a，你可能会看到类似以下的输出：

```
Linux myhostname 4.15.0-29-generic #31-Ubuntu SMP Tue Jul 17 15:39:52 UTC 2018 x86_64 x86_64 x86_64 GNU/Linux
```

这个输出告诉我们，这台计算机正在运行 Linux 内核，版本是 4.15.0-29-generic，编译时间是 2018 年 7 月 17 日，硬件架构是 x86_64，操作系统是 GNU/Linux。

uname -a 命令是一个非常有用的工具，可以帮助你快速了解你的系统的基本信息。

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\第一次作业-1.png)

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\第一次作业-2.png)

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\第一次作业-3.png)

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\第一次作业-4.png)



# 第二次作业

1. (其它)
依托开源中国社区推出的基于 Git 的代码托管服务平台码云(gitee)，为开源项目LinuxAbc贡献自己的力量，学习软件开源开发方法，体会开源协作模式与开源精神，成为一名开源贡献者。步骤及要求如下：

1、注册自己的码云账号，并签署贡献许可协议CLA（Contribution License Agreement）。

2、登录码云网站，将LinuxAbc（https://gitee.com/aaa124578/LinuxAbc）的代码Fork一份到自己的仓库。

3、安装Git，将码云网站自己“仓库”中的LinuxAbc代码克隆到本地开发环境中。

4、以自己的学号为名称建立LinuxAbc的新分支，在自己的新分支中进行软件的再开发。要求：编写自己的“命令本”文件。

（1）项目主目录中的command.csv为app的默认“命令本”文件。拷贝出此文件，在此基础上修改生成自己的“命令本”文件。“命令本”文件的格式见项目介绍中的第4条。

（2）可以从项目主页中下载LinuxAbc的APK文件，然后安装在安卓手机或者夜游之类的安卓模拟器中。

（3）LinuxAbc提供“命令本”导入功能，编写完善自己的“命令本”文件后，将其导入自己的手机或者模拟器中的LinuxAbc中，查看效果，并应用其背命令。

（4）自己的“命令本”文件编写完毕后，命名为“学号.csv”，如55221234.csv，拷贝到自己分支项目的stucomm/csw2023/2022LT目录中。

注意：不要修改自己项目分支中的其他任何文件，包括command.csv，本次作业仅允许在stucomm/csw2023/2022LT目录中提交一个文件。

5、分别使用git  add、git commit、git push命令，将分支上传到自己码云网站“仓库”中。

6、向社区官方代码库aaa/LinuxAbc提交PR(Pull Request)。

7、提交的PR经审核通过合并入项目的master分支后，从码云网站项目主页进入stucomm/csw2023/2022LT目录，截图并明显标记出自己的“命令本”文件。将做好标记的截图上传（粘贴）到学习通作业提交区域中。

8、本次作业为长周期作业，希望大家尽可能编写完善适用于自己的“命令本”，提交截止时间为2023年11月24日23：59。

【下面这个是他PPT上面的】

```
#git 应用
#安装git
    $   dnf  install  -y  git
#从git服务器克隆代码到本地
    $   git  clone https://gitee.com/my-tux/LinuxAbc.git
    $   cd   LinuxAbc
#配置开发者用户名和邮箱
    $   git   config  user.name   linuxer
    $   git  config   user.email   linuxer@qq.com
#创建分支
    $   git  branch  c21219999
#切换分支
    $  git  checkout  c21219999
#查看文件变动状态
    $  git   status
    $  cp  command.cvs  stucomm/ccst2023/csw2023/UL/c21219999.cvs
    $  vi   stucomm/ccst2023/csw2023/UL/c21219999.cvs
    $  git  status
#添加文件到暂存区
    $   git  add  .
    $   git  status
#提交文件变动到版本库
    $   git  commit  -m  “这里写提交原因”
#将本地代码改动推到服务器上的自己代码仓库中
    $  git   push  origin  c21219999

```

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\第二次作业.png)



# 第三次作业

```
echo   "command   date:"
#打印字符串"command   date:"到终端

date
#显示当前日期和时间

date +%Y/%m/%d
#以"年/月/日"的格式显示当前日期

date +%T
#以24小时制（HH:MM:SS）显示当前时间

date +%H-%M-%S
#以24小时制（HH-MM-SS）显示当前时间

echo
#打印一个空行到终端

sleep 5
#让脚本暂停执行5秒


echo"command    who:"
#打印字符串"command    who:"到终端

who
#显示当前登录的用户信息

who -q
#显示当前登录的用户名称和用户数量

who -b
#显示系统最后一次启动的时间

echo
#打印一个空行到终端

sleep 5
#让脚本暂停执行5秒



echo "command cal:"
#打印字符串"command cal:"到终端

cal
#显示当前月份的日历

ca1 7 1921
#显示1921年7月的日历

cal -j
#显示当前年份的日历，但日期以一年中的第几天表示

cal -y
#显示当前年份的完整日历




bash p2.sh
#在bash shell中执行名为“p2.sh”的脚本

man date
#显示date命令的手册页。手册页包含了关于命令的详细信息，如它的功能、选项和用法

man who
#显示who命令的手册页

man cal
#显示cal命令的手册页

info date
#显示date命令的info页。info页通常比手册页提供更详细的信息

info who
#显示who命令的info页

info cal
#显示cal命令的info页
```



# 第四次作业



```
#!/bin/bash

# 1. 判断当前用户是否为root
if [ "$USER" == "root" ]; then
  echo "Current user : root"
else
  echo "Current user : $USER"
fi

# 2. 检查当前目录是否为用户主目录
if [ "$PWD" == "$HOME" ]; then
  echo "You are in the home directory!"
else
  cd "$HOME"
  echo "You have gone back to your home directory!"
fi

# 3. 检测工作目录中是否存在bin子目录
if [ -d "bin" ]; then
  rm -rf "bin"
  mkdir "bin"
  echo "bin has been recreated!"
else
  mkdir "bin"
  echo "bin has been created!"
fi

# 4. 使用set命令将date命令执行的结果设置成位置参数
today=$(date +%a)  # 获取今天是星期几的前三位缩写

# 检查今天是否为休息日
if [ "$today" == "Sat" ] || [ "$today" == "Sun" ]; then
  echo "Today is a weekend!"
else
  echo "Today is $today."
fi
```

