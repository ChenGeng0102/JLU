# 第一次实验

## **一、登录 Linux 终端**

### **（1） 登录系统**

**a．使用自己的用户名和密码登录云实验平台。**

```
c55220332

123456	#不会显示
```

### **（2） 使用 shell**

**a．分别执行 help exit、help ls 和 help ， 查看命令运行结果。**

```
c55220332@unix2:~$ help exit
exit: exit [n]
    退出 shell。
    
    退出 shell，退出状态为 N。如果 N 被省略，则退出状态为最后一个执行的
    命令的退出状态。
```

因为exit是内部命令，所以会显示出帮助信息。如果你在exit后面提供了一个数字参数，那么这个数字会被用作shell的退出状态。如果没有提供参数，那么shell的退出状态将是最后执行的命令的退出状态。

在Linux中，exit命令的退出状态有以下几种：

0：表示命令成功执行，没有错误。
非零值：表示发生了某种错误12。我们可以使用不同的退出代码来表示不同的错误。例如，我们可以使用exit 42来生成退出代码42。
此外，还有一些特殊的退出代码：

1：这是最常用的退出代码，应被用作各种杂项错误的通用值。
2：退出代码2表示某些shell内置命令的无效使用。例如，内置命令包括alias，echo和printf。
126：在这种情况下，被调用的命令无法执行。这可能是因为存在权限问题或者命令不可执行。
127：找不到命令。这可能是因为出现了拼写错误或者我们的PATH出现了问题。
128+n：在Linux中，程序可能会发送33种不同的信号。当程序在接收到其中一个信号后终止时，它将返回等于128 + signal-number的错误代码。例如，当我们通过键入Control-C来终止一个程序时，我们实际上向它发送了一个SIGINT信号。这个信号的值为2。因此，程序将停止执行并返回一个值为128 + 2 = 130的退出代码。
请注意，因为退出代码由单个字节值表示，所以最高可能的退出代码是255。然而，我们需要返回更大的值作为退出代码。超过255的值将超出范围并被环绕。例如，退出代码383将被环绕并导致有效的退出代码为127，这被翻译为“找不到命令”。或者，退出代码-1被翻译为255。

```
c55220332@unix2:~$ help ls
-bash: help: 没有与 "ls" 匹配的帮助主题。尝试使用 "help help" 或 "man -k ls" 或 "info ls"。
```

ls是外部命令，不会显示帮助信息

```
c55220332@unix2:~$ help
GNU bash，版本 5.1.16(1)-release (x86_64-pc-linux-gnu)
这些 shell 命令是内部定义的。输入 "help" 以获取本列表。
输入 "help 名称" 以得到有关函数 "名称" 的更多信息。
使用 "info bash" 来获得关于 shell 的更多一般性信息。
使用 "man -k" 或 "info" 来获取不在本列表中的命令的更多信息。

名称旁边的星号 (*) 表示该命令被禁用。

 任务说明符 [&]                                          history [-c] [-d 偏移量] [n] 或 history -anrw [文件>
 (( 表达式 ))                                            if 命令; then 命令; [ elif 命令; then 命令; ]... [ e>
 . 文件名 [参数]                                         jobs [-lnprs] [任务说明符 ...] 或 jobs -x 命令 [参>
 :                                                       kill [-s 信号说明符 | -n 信号编号 | -信号说明符] pid>
 [ 参数... ]                                             let 参数 [参数 ...]
 [[ 表达式 ]]                                            local [选项] 名称[=值] ...
 alias [-p] [名称[=值] ... ]                             logout [n]
 bg [任务说明符 ...]                                     mapfile [-d 分隔符] [-n 计数] [-O 起始] [-s 计数] [->
 bind [-lpvsPSVX] [-m 键映射] [-f 文件名] [-q 名称] [->  popd [-n] [+N | -N]
 break [n]                                               printf [-v var] 格式 [参数]
 builtin [shell-内建 [参数 ...]]                         pushd [-n] [+N | -N | 目录]
 caller [表达式]                                         pwd [-LP]
 case 词语 in [模式 [| 模式]...) 命令 ;;]... esac        read [-ers] [-a 数组] [-d 分隔符] [-i 文本] [-n 字>
 cd [-L|[-P [-e]] [-@]] [目录]                           readarray [-d 分隔符] [-n 计数] [-O 起始] [-s 计数] >
 command [-pVv] 命令 [参数 ...]                          readonly [-aAf] [名称[=值] ...] 或 readonly -p
 compgen [-abcdefgjksuv] [-o 选项] [-A 动作] [-G 全局>  return [n]
 complete [-abcdefgjksuv] [-pr] [-DEI] [-o 选项] [-A >  select 名称 [in 词语 ... ;] do 命令; done
 compopt [-o|+o 选项] [-DEI] [名称 ...]                  set [--abefhkmnptuvxBCHP] [-o 选项名] [--] [参数 ..>
 continue [n]                                            shift [n]
 coproc [名称] 命令 [重定向]                             shopt [-pqsu] [-o] [选项名 ...]
 declare [-aAfFgiIlnrtux] [-p] [name[=value] ...]        source 文件名 [参数]
 dirs [-clpv] [+N] [-N]                                  suspend [-f]
 disown [-h] [-ar] [任务说明符 ... | pid ...]            test [表达式]
 echo [-neE] [参数 ...]                                  time [-p] 流水线
 enable [-a] [-dnps] [-f 文件名] [名称 ...]              times
 eval [参数 ...]                                         trap [-lp] [[参数] 信号说明符 ...]
 exec [-cl] [-a 名称] [命令 [参数 ...]] [重定向 ...]     true
 exit [n]                                                type [-afptP] 名称 [名称 ...]
 export [-fn] [名称[=值] ...] 或 export -p               typeset [-aAfFgiIlnrtux] [-p] name[=value] ...
 false                                                   ulimit [-SHabcdefiklmnpqrstuvxPT] [限制]
 fc [-e 编辑器名] [-lnr] [起始] [终止] 或 fc -s [模式>   umask [-p] [-S] [模式]
 fg [任务说明符]                                         unalias [-a] 名称 [名称 ...]
 for 名称 [in 词语 ... ] ; do 命令; done                 unset [-f] [-v] [-n] [名称 ...]
 for (( 表达式1; 表达式2; 表达式3 )); do 命令; done      until 命令; do 命令; done
 function 名称 { 命令 ; } 或 name () { 命令 ; }          variables - 一些 shell 变量的名称和含义
 getopts 选项字符串 名称 [参数 ...]                      wait [-fn] [-p 变量] [id ...]
 hash [-lr] [-p 路径名] [-dt] [名称 ...]                 while 命令; do 命令; done
 help [-dms] [模式 ...]                                  { 命令 ; }
```



**b. 执行 man cal 命令，浏览 cal 命令的选项和功能，并执行验证。**

执行man cal后，会进入到另一个界面，显示cal命令的手册页

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\man cal.png)

在Linux中，man cal命令会显示cal命令的手册页【按q退出手册页】。cal命令用于显示日历。如果没有指定参数，它将显示当前月份的日历。以下是一些选项和参数：

-3：显示前一个月、当前月和下一个月的日历。
-1：只显示当前月的日历。这是默认选项。
-A number：在显示的末尾添加指定的月份数。
-B number：在显示的开始添加指定的月份数。
-y：显示指定年份的日历。
-m month：显示指定月份的日历。
此外，cal命令还支持显示特定日期的日历，例如cal 25 11 2020会显示2020年11月的日历，并高亮显示25号。【如果没有25，就不会高亮显示25号】

实例1：显示当前月份日历
命令：cal
输出：

```
c55220332@unix2:~$ cal
      十二月 2023        
日 一 二 三 四 五 六  
                1  2  
 3  4  5  6  7  8  9  
10 11 12 13 14 15 16  
17 18 19 20 21 22 23  
24 25 26 27 28 29 30  
31    
```

实例2：显示指定月份的日历
命令：cal 6 2022
输出：

```
c55220332@unix2:~$ cal 6 2022
      六月 2022         
日 一 二 三 四 五 六  
          1  2  3  4  
 5  6  7  8  9 10 11  
12 13 14 15 16 17 18  
19 20 21 22 23 24 25  
26 27 28 29 30        
       
```

实例3：显示2022年日历
命令：cal -y 2022
输出：

```
c55220332@unix2:~$ cal -y 2022
                            2022
         一月                    二月                    三月           
日 一 二 三 四 五 六     日 一 二 三 四 五 六     日 一 二 三 四 五 六  
                   1         1  2  3  4  5         1  2  3  4  5  
 2  3  4  5  6  7  8   6  7  8  9 10 11 12   6  7  8  9 10 11 12  
 9 10 11 12 13 14 15  13 14 15 16 17 18 19  13 14 15 16 17 18 19  
16 17 18 19 20 21 22  20 21 22 23 24 25 26  20 21 22 23 24 25 26  
23 24 25 26 27 28 29  27 28                 27 28 29 30 31        
30 31                                                             

         四月                    五月                    六月           
日 一 二 三 四 五 六      日 一 二 三 四 五 六    日 一 二 三 四 五 六  
                1  2   1  2  3  4  5  6  7            1  2  3  4  
 3  4  5  6  7  8  9   8  9 10 11 12 13 14   5  6  7  8  9 10 11  
10 11 12 13 14 15 16  15 16 17 18 19 20 21  12 13 14 15 16 17 18  
17 18 19 20 21 22 23  22 23 24 25 26 27 28  19 20 21 22 23 24 25  
24 25 26 27 28 29 30  29 30 31              26 27 28 29 30        
                                                                  

         七月                    八月                    九月           
日 一 二 三 四 五 六      日 一 二 三 四 五 六    日 一 二 三 四 五 六  
                1  2      1  2  3  4  5  6               1  2  3  
 3  4  5  6  7  8  9   7  8  9 10 11 12 13   4  5  6  7  8  9 10  
10 11 12 13 14 15 16  14 15 16 17 18 19 20  11 12 13 14 15 16 17  
17 18 19 20 21 22 23  21 22 23 24 25 26 27  18 19 20 21 22 23 24  
24 25 26 27 28 29 30  28 29 30 31           25 26 27 28 29 30     
31                                                                

         十月                   十一月                   十二月           
日 一 二 三 四 五 六     日 一 二 三 四 五 六    日 一 二 三 四 五 六  
                   1         1  2  3  4  5               1  2  3  
 2  3  4  5  6  7  8   6  7  8  9 10 11 12   4  5  6  7  8  9 10  
 9 10 11 12 13 14 15  13 14 15 16 17 18 19  11 12 13 14 15 16 17  
16 17 18 19 20 21 22  20 21 22 23 24 25 26  18 19 20 21 22 23 24  
23 24 25 26 27 28 29  27 28 29 30           25 26 27 28 29 30 31  
30 31 
```

实例4：显示天数
命令：cal -j
输出：

```
c55220332@unix2:~$ cal -j
         十二月 2023            
 日  一  二  三  四  五  六  
                    335 336  
337 338 339 340 341 342 343  
344 345 346 347 348 349 350  
351 352 353 354 355 356 357  
358 359 360 361 362 363 364  
365    
```

实例5：显示指定的月份
命令：cal -m 11
输出：

```
c55220332@unix2:~$ cal -m 11
      十一月 2023        
日 一 二 三 四 五 六  
          1  2  3  4  
 5  6  7  8  9 10 11  
12 13 14 15 16 17 18  
19 20 21 22 23 24 25  
26 27 28 29 30        
             
```

实例6：显示近三个月份
命令：cal -3
输出：

```
c55220332@unix2:~$ cal -3
      十一月 2023              十二月 2023              一月 2024         
日 一 二 三 四 五 六  日 一 二 三 四 五 六  日 一 二 三 四 五 六  
          1  2  3  4                  1  2      1  2  3  4  5  6  
 5  6  7  8  9 10 11   3  4  5  6  7  8  9   7  8  9 10 11 12 13  
12 13 14 15 16 17 18  10 11 12 13 14 15 16  14 15 16 17 18 19 20  
19 20 21 22 23 24 25  17 18 19 20 21 22 23  21 22 23 24 25 26 27  
26 27 28 29 30        24 25 26 27 28 29 30  28 29 30 31           
                      31    
```



**c．执行 who 命令和 who am i，对比其执行结果。**

```
c55220332@unix2:~$ who
c55220332 pts/4        2023-12-04 10:11 (192.168.1.243)
c55220119 pts/5        2023-12-04 10:57 (192.168.1.243)
c55220332@unix2:~$ who am i
c55220332 pts/4        2023-12-04 10:11 (192.168.1.243)
```

who命令：列出当前登录的所有用户。例如，如果你以root用户身份登录并输入who，它会显示所有已建立连接的用户。

who am i命令：显示当前有效用户的用户名。例如，如果你在root shell中执行su ramesh切换到ramesh用户，然后运行who am i，它将给出当前用户ramesh作为输出。



**d．执行 date 命令，查看当前日期时间。**

```
c55220332@unix2:~$ date
2023年 12月 04日 星期一 11:00:16 CST
```

在Linux中，date命令支持许多格式控制字符来定制输出的日期和时间格式。以下是一些例子：

date +%Y-%m-%d：这将输出当前日期，格式为“年-月-日”。例如，“2023-12-04”。
date +%H:%M:%S：这将输出当前时间，格式为“小时:分钟:秒”。例如，“10:14:57”。
date +%A：这将输出当前是星期几。例如，“Monday”。
在这些例子中，+%Y-%m-%d、+%H:%M:%S和+%A都是格式字符串。%Y代表四位数的年份，%m代表月份，%d代表日期，%H代表小时，%M代表分钟，%S代表秒，%A代表星期几。



**e. 执行 tty 命令，查看自己所在的登录终端。**

```
c55220332@unix2:~$ tty
/dev/pts/4
```

在Linux中，tty命令用于打印连接到标准输入的终端的设备文件名。在你的例子中，/dev/pts/4就是你当前使用的终端的设备文件名。这意味着你当前的shell会话是通过/dev/pts/4这个设备文件与终端进行交互的。

pts在Linux中代表伪终端从设备（pseudo terminal slave）。pts是pty（伪终端设备）的从设备部分。一个pty是一个由其他应用程序模拟的终端设备（例如：telnet或ssh就是这样的程序）。当通过另一个应用程序（如SSH或PuTTY）连接到Linux计算机时，会使用伪终端从设备（pts）会话。

**f．分别执行 file / 、 file /etc/passwd 、file /bin/bash、file /dev/tty1、file /dev/sda1，查看命令执行结果。**

```
c55220332@unix2:~$ file /
/: directory
```

在Linux中，file /命令会返回根目录/的文件类型。根据file命令的定义，它会对每个参数进行一系列测试，以确定文件类型。在这种情况下，/是一个目录，所以file /命令应该会返回类似于/: directory的输出，表示/是一个目录。



```
c55220332@unix2:~$ file /etc/passwd
/etc/passwd: Unicode text, UTF-8 text
```

在这种情况下，/etc/passwd是一个文本文件，所以file /etc/passwd命令应该会返回类似于/etc/passwd: Unicode text, UTF-8 text的输出，表示/etc/passwd是一个UTF-8编码的Unicode文本文件。



```
c55220332@unix2:~$ file /bin/bash
/bin/bash: ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, BuildID[sha1]=33a5554034feb2af38e8c75872058883b2988bc5, for GNU/Linux 3.2.0, stripped
```

在这种情况下，/bin/bash是一个可执行文件，所以file /bin/bash命令应该会返回类似于/bin/bash: ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, BuildID[sha1]=33a5554034feb2af38e8c75872058883b2988bc5, for GNU/Linux 3.2.0, stripped的输出，表示/bin/bash是一个64位的ELF格式的可执行文件，它是动态链接的，并使用/lib64/ld-linux-x86-64.so.2作为解释器。



```
c55220332@unix2:~$ file /dev/tty1
/dev/tty1: character special (4/1)
```

在这种情况下，/dev/tty1是一个字符设备文件，所以file /dev/tty1命令应该会返回类似于/dev/tty1: character special (4/1)的输出，表示/dev/tty1是一个特殊的字符设备文件。



```
c55220332@unix2:~$ file /dev/sda1
/dev/sda1: block special (8/1)
```

在这种情况下，/dev/sda1是一个块设备文件，所以file /dev/sda1命令应该会返回类似于/dev/sda1: block special (8/1)的输出，表示/dev/sda1是一个特殊的块设备文件。



### **（3） 退出当前用户**

**a．执行[Ctrl-D]、exit 或 logout 命令退出当前终端。**





## **二、vi 初级操作**

### **（1） 打开 vi**

**打开 vi 编辑器，观察其特征。**

```
vi
```

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\vi.png)



### **（2） 文件录入和修改**

**a．练习在命令模式和文本输入之间的切换。**

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\vi命令切换.png)

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\进入文本模式.png)



**b．在 vi 中输入以下内容：**

```
The vi history
The vi editor was developed at the University of california, berkeley
as part of the berkeley unix system.
```

**c．保存文件到~/exp1/下，名称为 vi_history_1，退出 vi。**

```
打开vi编辑器：在终端中输入vi并按回车键。

输入你想要保存的内容。

保存文件：按下Esc键进入命令模式，然后输入:w ~/exp1/vi_history_1并按回车键。这将会把你的文件保存到~/exp1/目录下，并命名为vi_history_1。

退出vi编辑器：在命令模式下，输入:q并按回车键。
```

**d．用 vi 打开文件 vi_history_1。**

```
vi vi_history_1
```

**e．将 vi 中的内容修改为以下内容：**

```
The vi history
The vi editor was developed at the University of california
berkeley as part of the berkeley unix system. At the beginning the vi editor was part of another editor
The vi part of the ex editor was often used and became very. This popularity forced the developers to come up with a separate
vi editor. now the vi editor is independent of the ex editor and is available on
most of the UNIX operating system.
The vi editor is a good editor for every editing jobs.
The vi editor is a good editor for every editing jobs.
```

**f．将以上内容保存到文件 vi_history_2 中。**

```
将内容保存到新文件中。按Esc键进入命令模式，然后输入:w ~/exp1/vi_history_2并按回车键保存文件。
```

**g．继续修改 vi 中的内容，目标结果如下：**

```
The vi history
The vi editor was developed at the University of California
Berkeley as part of the Berkeley UNIX system. At the beginning the vi (visual) editor was part of the ex editor
and you had to be in the ex editor to use the vi editor. The vi part of the ex editor was often used and became
very popular. This popularity forced the developers to come up
with a separate vi editor. Now the vi editor is independent of the ex editor and is available
on most of the UNIX operating systems. The vi editor is a good, efficient editor for every editing jobs
although it could be more user friendly. 
```

**h．将以上内容保存到文件 vi_history_3 中。**

```
将内容保存到新文件中。按Esc键进入命令模式，然后输入:w ~/exp1/vi_history_3并按回车键保存文件。
```

接下来我觉得是在该文件中执行:q!，这样就不会对vi_history_1修改

**（3） 内容查找**
**打开 vi_history_3 文件**

**a．使用斜线（/）在 vi 中查找单词 vi，使用 n 遍历所有查找结果。**

```
在命令模式下，输入 /vi 并按回车键，vi 编辑器会将光标移动到文件中第一个 “vi” 的位置。
按 n 键，vi 编辑器会将光标移动到文件中下一个 “vi” 的位置。你可以反复按 n 键来遍历所有的 “vi”。
```

**b．使用问号（?）在 vi 中查找单词 vi，使用 n 遍历所有查找结果。**

```
在命令模式下，输入 ?vi 并按回车键，vi 编辑器会将光标移动到文件中最后一个 “vi” 的位置。
按 n 键，vi 编辑器会将光标移动到文件中上一个 “vi” 的位置。你可以反复按 n 键来遍历所有的 “vi”。
```

【/vi下按n会找下一个，?vi下按n会找上一个】

**（4） 删除与替换**
**a．将光标移到文件头，删除前 5 行。然后再恢复删除。**

```
在命令模式下，输入 gg 来将光标移到文件头。
输入 5dd 来删除前 5 行。
输入 u 来撤销删除操作。
```

**b．将光标移到第二行开头，删除 10 个字符。然后再恢复删除。**

```
在命令模式下，输入 2G 来将光标移到第二行开头。
输入 10x 来删除 10 个字符。
输入 u 来撤销删除操作。
```

**c. 使用 r 命令替换光标所在位置的字符，然后再恢复。**

```
在命令模式下，将光标移到你想要替换的字符上。
输入 r，然后输入你想要替换的字符。
输入 u 来撤销替换操作。
```

**d．使用 R 命令将单词 developers 替换为 creators。**

```
在命令模式下，将光标移到单词 developers 的开头。
输入 R 进入替换模式。
输入 creators 来替换 developers。
按 Esc 键退出替换模式。
```

**（5） 退出 vi**
**a．执行:wq 命令退出 vi。**
**b．查看保存的三个文件。**



## **三、目录与文件初级操作**

### **（1）使用 ls /命令查看根目录中都有哪些系统目录，说出这些目录的用途。**

```
c55220332@unix2:~/exp1$ ls /
bin   cdrom  etc   lib    lib64   lost+found  mnt  proc  run   snap  swap.img  tmp  var
boot  dev    home  lib32  libx32  media       opt  root  sbin  srv   sys       usr  z
```

/bin：存放着最常用的程序和指令。
/boot：存放的是启动 Linux 时使用的一些核心文件，包括一些连接文件以及镜像文件。
/cdrom：通常是可移动设备的挂载点，比如光盘驱动器。
/dev：存放的是 Linux 的外部设备，在 Linux 中访问设备的方式和访问文件的方式是相同的。
/etc：存放所有的系统管理所需要的配置文件和子目录。
/home：用户的主目录，在 Linux 中，每个用户都有一个自己的目录。
/lib, /lib32, /lib64, /libx32：这些目录存放着系统最基本的动态连接共享库，其作用类似于 Windows 里的 DLL 文件。
/lost+found：一般情况下为空的，系统非法关机后，这里就存放一些文件。
/media：Linux 系统会自动识别一些设备，例如U盘、光驱等等，当识别后，Linux 会把识别的设备挂载到这个目录下。
/mnt：系统提供该目录是为了让用户临时挂载别的文件系统的。
/opt：这是给主机额外安装软件所摆放的目录。
/proc：存储的是当前内核运行状态的一系列特殊文件，这个目录是一个虚拟的目录，它是系统内存的映射。
/root：该目录为系统管理员，也称作超级权限者的用户主目录。
/run：是一个临时文件系统，存储系统启动以来的信息。当系统重启时，这个目录下的文件应该被删掉或清除。
/sbin：这里存放的是系统管理员使用的系统管理程序。
/snap：这个目录用于存放 Snap 应用。
/srv：该目录存放一些服务启动之后需要提取的数据。
/swap.img：这是交换空间文件，用于当物理内存（RAM）被用完时。
/sys：这是 Linux2.6 内核的一个很大的变化。该目录下安装了 2.6 内核中新出现的一个文件系统 sysfs。
/tmp：这个目录是用来存放一些临时文件的。
/usr：这是一个非常重要的目录，用户的很多应用程序和文件都放在这个目录下，类似于 windows 下的 program files 目录。
/var：这个目录中存放着在不断扩充着的东西，我们习惯将那些经常被修改的目录放在这个目录下。包括各种日志文件。
/z：这个目录看起来像是你自己创建的，因为它并不是 Linux 系统的标准目录。你应该记得它的用途，因为只有创建它的人才知道它的用途。

### **（2）尝试在根目录/下创建目录和删除目录，预测其结果并进行验证。**

```
c55220332@unix2:~$ cd /
c55220332@unix2:/$ pwd
/
c55220332@unix2:/$ mkdir test
mkdir: 无法创建目录 "test": 权限不够
```

```
c55220332@unix2:/$ rmdir /
rmdir: 删除 '/' 失败: 设备或资源忙
```



### **（3）执行如下 linux 命令序列，观察每步执行的结果，思考其原因（$是提示符）：**

**$ ls**

**$ pwd**

**$ cd .. **

**$ pwd**

**$ cd**

**$ pwd**

**$ cd ~**

**$ pwd**

```
c55220332@unix2:~$ ls
exp1  exp2  exp3  exp4  Mydir
c55220332@unix2:~$ pwd
/home/c55220332
c55220332@unix2:~$ cd ..
c55220332@unix2:/home$ pwd
/home
c55220332@unix2:/home$ cd
c55220332@unix2:~$ pwd
/home/c55220332
c55220332@unix2:~$ cd ~
c55220332@unix2:~$ pwd
/home/c55220332
```

cd不带参数时回到主目录

**（4）在~/exp1 目录下创建子目录 xyz 和 XYZ。**

```
c55220332@unix2:~$ cd exp1
c55220332@unix2:~/exp1$ mkdir XYZ
c55220332@unix2:~/exp1$ mkdir xyz
```

**（5）在子目录 xyz 中使用 vi 创建文件 test1，在子目录 XYZ 中使用 cat 命令创建文件 test2，其内容如下：**
**This is a test file. **

```
c55220332@unix2:~/exp1$ cd xyz
c55220332@unix2:~/exp1/xyz$ vi test1
```

```
c55220332@unix2:~/exp1/xyz$ cd ..
c55220332@unix2:~/exp1$ cd XYZ
c55220332@unix2:~/exp1/XYZ$ ls
c55220332@unix2:~/exp1/XYZ$ cat > test2
This is a test file.
c55220332@unix2:~/exp1/XYZ$ cat test2
This is a test file.
```

按ctrl+d退出输入模式

**（6）以下面几种方式显示主目录的内容：**
**a.以长格式列出文件；**
**b.显示文件的索引节点号；**
**c.列出所有文件，包括隐藏文件。**

```
c55220332@unix2:~/exp1/XYZ$ cd ~
c55220332@unix2:~$ ls -l
总计 20
drwxr-xr-x 4 c55220332 ccst      4096 12月  4 16:12 exp1
drwxr-xr-x 3 c55220332 ccst      4096 12月  4 16:00 exp2
drwxr-xr-x 2 c55220332 ccst      4096 10月 20 19:28 exp3
drwxr-xr-x 4 c55220332 ccst      4096 11月  3 19:22 exp4
drwxr-xr-x 2 c55220332 c55220332 4096 10月 13 18:44 Mydir
c55220332@unix2:~$ ls -i
656575 exp1  791620 exp2  811834 exp3  832723 exp4  797986 Mydir
c55220332@unix2:~$ ls -a
.   .bash_history  .bashrc    exp1  exp3  .lesshst  .profile  .swp  .viminfo
..  .bash_logout   .checkkey  exp2  exp4  Mydir     .show     .vim
```

**（7）在子目录 xyz 中查看文件 test1 的访问权限。**

```
c55220332@unix2:~$ cd exp1/xyz
c55220332@unix2:~/exp1/xyz$ ls -l test1
-rw-r--r-- 1 c55220332 c55220332 0 12月  4 16:19 test1
```

**（8）使用 rmdir 命令删除目录 xyz，使用 rm 命令删除目录 XYZ。**

```
c55220332@unix2:~/exp1/xyz$ cd ..
c55220332@unix2:~/exp1$ rmdir xyz
rmdir: 删除 'xyz' 失败: 目录非空
c55220332@unix2:~/exp1$ rm -r XYZ
c55220332@unix2:~/exp1$ ls
test1.txt  test2.txt  test3.txt  vi  vi_history_1  vi_history_2  vi_history_3  xyz
```

rmdir只能删空目录，这道题我当时没成功删掉xyz也满分了



# 第二次实验

**1.在~/exp2/Mydir 下，创建如下目录结构。（注意大小写）**
**![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\实验二目录文件.png)**



```
在 Linux 系统中，你可以使用 mkdir 命令来创建新的目录。以下是一些基本的用法：

创建一个新的目录：mkdir directory_name
创建多级目录：mkdir -p directory_name/subdirectory_name
创建带有特定权限的目录：mkdir -m 755 directory_name
这里，directory_name 和 subdirectory_name 是你想要创建的目录的名称，755 是你想要设置的权限。

请注意，如果你想在根目录 / 下创建目录，你可能需要 root 权限。在这种情况下，你可以使用 sudo 命令来获取 root 权限。例如，sudo mkdir /directory_name。
```

**2.**【本题用first.test代替first】
**(1) 在 MyDoc 中创建一个空文件 first。**

```
c55220332@unix2:~$ cd exp2/Mydir/MyDoc
c55220332@unix2:~/exp2/Mydir/MyDoc$ touch first.test
c55220332@unix2:~/exp2/Mydir/MyDoc$ ls
first  first.test
c55220332@unix2:~/exp2/Mydir/MyDoc$ rm first.test
c55220332@unix2:~/exp2/Mydir/MyDoc$ ls
first
c55220332@unix2:~/exp2/Mydir/MyDoc$ vim first.test
c55220332@unix2:~/exp2/Mydir/MyDoc$ ls
first  first.test
```

两种方法，一个是touch；一个是直接vim，但是退出时得保存

**(2) 用 vim 打开 first，然后加载~/exp2/vim.txt 的内容到编辑区。**

```
vim first
:r ~/exp2/vim.txt
```

**(3) 增加新行内容，至少达到 30 行，然后保存退出 vim。**

**(4) 分别使用 cat、more 和 less 命令查看 first 内容。**

```
c55220332@unix2:~/exp2/Mydir/MyDoc$ vim first.test
c55220332@unix2:~/exp2/Mydir/MyDoc$ cat first.test

Vim is a clone, with additions, of Bill Joy's vi text editor program for Unix.
Vim's author, Bram Moolenaar, based it upon the source code for a port of the Stevie editor to the Amiga and released a version to the public in 1991. 
Vim is designed for use both from a command-line interface and as a standalone application in a graphical user interface. 
Vim is free and open-source software and is released under a license that includes some charityware clauses, encouraging users who enjoy the software to consider donating to children in Uganda. 
The license is compatible with the GNU General Public License through a special clause allowing distribution of modified copies "under the GNU GPL version 2 or any later version".


























```

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\more1.png)

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\more2.png)

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\less.png)

给我的感觉就是行数少的时候cat和more其实没区别，行数多的时候more可以在shell里面分页。less是感觉直接进到vi里面一样



**(5) 使用 tail 和 head 命令将 first 文件的第 13-15 行内容保存到~/exp2/Mydir/first1315 文件里。**

```
c55220332@unix2:~/exp2/Mydir/MyDoc$ tail -n +13 first.test | head -n 3 > test2
c55220332@unix2:~/exp2/Mydir/MyDoc$ cat test2
13
14
15
```

我这里用test2代替了~/exp2/Mydir/first1315

tail 命令通常用于显示文件的末尾部分。然而，当你使用 -n +行号 选项时，tail 命令会从指定的行号开始，显示该行及其后面的所有行。例如，tail -n +13 会显示从第 13 行开始的所有行。

head -n 3：这个命令会从上一个命令的输出中提取前 3 行。

```
c55220332@unix2:~/exp2/Mydir/MyDoc$ head -n 15 first.test | tail -n 3 > test2
c55220332@unix2:~/exp2/Mydir/MyDoc$ cat test2
13
14
15
```

上面这个是方法2

- `head -n 15 first.test`：这个命令会提取 `first.test` 文件的前 15 行。
- `tail -n 3`：这个命令会从上一个命令的输出中提取最后 3 行。



**3.**
**(1) 将 目 录 ~/exp2/TESTdir 及 其 子 目 录 和 文 件 移 动 到~/exp2/Mydir 下。**

```
mv ~/exp2/TESTdir ~/exp2/Mydir
```

**(2) 进入 TESTdir 目录，使用 find 命令搜索所有.c 扩展名的文件，将搜索结果保存到~/exp2/Mydir/c.file 文件里。**

```
cd ~/exp2/Mydir/TESTdir
find . -name "*.c" > ~/exp2/Mydir/c.file
```

**(3) 为所有 AB 开头、x 结尾的文件名添加.txt 扩展名，例如 AB057x 改为 AB057x.txt**

```
find . -name "AB*x" -exec mv {} {}.txt \;
```

find . -name "AB*x"：这个命令会在当前目录（.）及其所有子目录中查找所有以 “AB” 开头，以 “x” 结尾的文件。
-exec mv {} {}.txt \;：这个命令会对每个匹配的文件执行 mv 命令，将文件的扩展名更改为 “.txt”。这里，{} 是一个占位符，代表 find 命令找到的文件。



# 第三次实验

**1（共 20 分）**
**a．在 exp3 目录下创建两个文件 numbers 和 chars**

```
c55220332@unix2:~/exp3$ touch n1.test
c55220332@unix2:~/exp3$ touch c1.test
```

**b．使用 vi 输入其内容，如下：**

```
numbers
11111111111111111
22222222222222222
33333333333333333
44444444444444444
55555555555555555
66666666666666666
77777777777777777
88888888888888888
99999999999999999

chars
aaaaaaaaaaaaaaaaa
bbbbbbbbbbbbbbbbb
ccccccccccccccccc
ddddddddddddddddd
eeeeeeeeeeeeeeeee
fffffffffffffffff
ggggggggggggggggg
hhhhhhhhhhhhhhhhh
iiiiiiiiiiiiiiiii
```



c．使用 cut 命令显示 numbers 每行的前 5 个字符。

```
c55220332@unix2:~/exp3$ cut -c 1-5 n1.test
11111
22222
33333
44444
55555
66666
77777
88888
99999
```

cut命令中-c为取出指定字符

除了上面这种用法，还有下面这种：

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\cut -c用法2.png)

cut -d [] -f

![](C:\Users\-COOH\AppData\Roaming\Typora\typora-user-images\cut -d[]-f.png)



**d．使用 paste 命令将 numbers 和 chars 文件连接到一起，用@字符作为域分隔符。将结果保存到 numbersANDchars 文件中。**

```shell
c55220332@unix2:~/exp3$ paste -d "@" n1.test c1.test > n1ANDc1
c55220332@unix2:~/exp3$ cat n1ANDc1
11111111111111111@aaaaaaaaaaaaaaaaa
22222222222222222@bbbbbbbbbbbbbbbbb
33333333333333333@ccccccccccccccccc
44444444444444444@ddddddddddddddddd
55555555555555555@eeeeeeeeeeeeeeeee
66666666666666666@fffffffffffffffff
77777777777777777@ggggggggggggggggg
88888888888888888@hhhhhhhhhhhhhhhhh
99999999999999999@iiiiiiiiiiiiiiiii
```

**不加分隔符就默认为制表符**

试了一下-d后面有没有空格都可以



**e．使用 wc 命令统计 numbersANDchars 的行数、字符数和单词数，结果保存到文件 wc1。wc1 文件格式为：**

```
The number of characters:【你统计的字符数】
The number of words:【你统计的单词数】
The number of lines:【你统计的行数】
```



```shell
echo -e "The number of characters:$(wc -c < numbersANDchars)\nThe number of words:$(wc -w < numbersANDchars)\nThe number of lines:$(wc -l < numbersANDchars)" > wc1
```



**2（共 30 分）**
**（1） 使用 echo 命令输出如下信息：**

```
a．Hello World.
b．Hello World
c．“Hello World” 
d．?'*[]&();>"<
```

```
c55220332@unix2:~/exp3$ echo -e \?\'\*\[\]\&\(\)\;\>\"\<
?'*[]&();>"<
```

**（2） shell 变量**
**a．创建变量 name，赋值为自己的姓名字母缩写。**
**b．显示变量 name 的值。**

```
55220332@unix2:~/exp3$ name1=cg
c55220332@unix2:~/exp3$ echo $name1
cg
```

**c．修改 shell 提示符使之显示命令序号。**

**d．为 rm -i 创建别名 del。**

```
c55220332@unix2:~/exp3$ PS1='\#'
7alias del='rm -i'
9ls
b1   c1.test  contact  d1   n1andc1  n1.test  numbersANDchars  sum     test3      wc1      x1
br1  chars    count81  dr1  n1ANDc1  numbers  schoolboy        sum.sh  wang_girl  wc.test  xr1
10vi test04
11ls
b1   c1.test  contact  d1   n1andc1  n1.test  numbersANDchars  sum     test04  wang_girl  wc.test  xr1
br1  chars    count81  dr1  n1ANDc1  numbers  schoolboy        sum.sh  test3   wc1        x1
12del test04
rm: 是否删除普通空文件 'test04'？ y
13ls
b1   c1.test  contact  d1   n1andc1  n1.test  numbersANDchars  sum     test3      wc1      x1
br1  chars    count81  dr1  n1ANDc1  numbers  schoolboy        sum.sh  wang_girl  wc.test  xr1
```

rm -i 是一个在 Unix 和类 Unix 系统中使用的 shell 命令。-i 选项会让 rm 命令在删除每个文件之前提示用户确认。



**（3） 登录配置文件**
**a．查看 exp3 目录中是否有.profile 文件，没有则创建。**
**b．修改.profile 文件，以便每次登录时显示如下信息：**

```
Hello World
Current Date and Time: 2022 年 10 月 29 日 13 时 01 分 05 秒
```

**注意：2022 年 10 月 29 日 13 时 01 分 05 秒仅示例输出格式，应该与你当前运行时的日期和时间吻合。**
**c．退出重新登录验证正确性。（桌面环境只需要重新打开终端即可）**

```
19:~/exp3$ find .profile
.profile
```

【这里我看着太难受把命令提示符改了一下】

```
echo -e 'echo "Hello World"\necho "Current Date and Time: $(date "+%Y 年 %m 月 %d 日 %H 时 %M 分 %S 秒")"' >> .profile

```

**（4） 进程管理**
**a．创建后台进程 vi numbers，查看其 ID。**
**b．终止该后台进程。**

```
30:~/exp3$ vi numbers.test &
[5] 3028188
31:~/exp3$ ps
    PID TTY          TIME CMD
3020719 pts/5    00:00:00 bash
3026463 pts/5    00:00:00 vi
3026729 pts/5    00:00:00 vi
3027128 pts/5    00:00:00 vi
3027945 pts/5    00:00:00 vi
3028188 pts/5    00:00:00 vi
3028189 pts/5    00:00:00 ps

[5]+  已停止               vi numbers.test
32:~/exp3$ ps 3028188
    PID TTY      STAT   TIME COMMAND
3028188 pts/5    T      0:00 vi numbers.test
33:~/exp3$ kill 3028188
34:~/exp3$ ps
    PID TTY          TIME CMD
3020719 pts/5    00:00:00 bash
3026463 pts/5    00:00:00 vi
3026729 pts/5    00:00:00 vi
3027128 pts/5    00:00:00 vi
3027945 pts/5    00:00:00 vi
3028188 pts/5    00:00:00 vi
3028994 pts/5    00:00:00 ps
```

**3（共 36 分）**
**a．使用 sort 命令，对 exp3 目录下的 contact 文件分别按姓名、性别和电话**
**进行正向排序和反向排序，分别保存为文件 x1，xr1，b1，br1，d1，dr1。**

```
sort -k 1 contact > x1.test
sort -r -k 1 contact > xr1.test
```

-k 1  每行的第一个字段

-r 逆序

**b．使用 grep 命令在 contact 中查找男同学，结果输出到屏幕，同时保存到文件 schoolboy 。**

```
grep " 男 " contact > schoolboy
```

**c．使用 grep 命令在 contact 中查找姓王的女同学，保存结果到 wang_girl。**

```
50:~/exp3$ grep "^王.*女" contact > test6
51:~/exp3$ cat test6
王畅   女 14574249234
王女芳 女 15032518437
王女霞 男 15967884004
王丽华 女 15533890107
王秀珍 女 15614117817
王雪梅 女 13739684907
王云   女 15875136914
王雪梅 女 13214286528
王兰英 女 13580155184
王琴   女 15137834052
王欣   女 14561264619
王秀华 女 18137206728
王秀荣 女 13374741425
王莹   女 14776306608
王秀珍 女 18721104849
王柳   女 15698598469
王丽华 女 15978742268
王金凤 女 15643047352
王丽   女 14548047382
```

^王.*女" 是一个正则表达式，它会匹配所有以 ‘王’ 开头，以 ‘女’ 结尾，中间有任何字符的字符串。



**d．统计 contact 中手机尾号是 81 的同学的个数，保存结果到 count81。**

```
grep '81$' contact | wc -l > count81
```



**4 （共 14 分）**
**在 exp3 目录下创建一个 shell 脚本 sum，要求如下：**
**(1) 使用方式为：$ sum a b，其中 a 和 b 代表两个整数，a<b**
**(2) 功能是计算从 a 到 b 的累加和**
**(3) 在屏幕上显示：a + ... + b = 累加和**
**例如 sum 57 90**
**输出结果为 57 + ... + 90 = 2499（注意空格）**

```
i=0;sum=0
for((i=$1;i<=$2;i++))
do
	sum=$[$sum+$i]
done
echo "$1 + ... + $2 = $sum"

```



# 第四次实验

**1 在 exp4 目录下创建一个 shell 脚本 largest，要求如下：**
**(1) 屏幕显示 Please enter the first integer:_然后接收用户的输入
(2) 屏幕显示 Please enter the second integer:_然后接收用户的输入**
**(3) 屏幕显示 Please enter the third integer:_然后接收用户的输入
(4) 之后，显示最大的整数。**

```shell
#!/bin/bash
echo -n "Please enter the first integer:"		#-n用来阻止换行
read a1
echo -n "Please enter the second integer:"
read a2
echo -n "Please enter the third integer:"
read a3
res=$a1
if [ $a2 -gt $res ]    #-gt表示大于  如果是小于 -lt
then
     res=$a2
fi
if [ $a3 -gt $res ]
then
     res=$a3
fi
echo "$res"
```

**2 在 exp4 目录下创建一个 shell 脚本 user_exist，要求如下：
(1) 屏幕显示 Please input a username:_然后键盘输入一个用户名**
**(2) 如果该用户存在，回显该用户名's shell is 该用户默认 shell**
**(3) 如果不存在，回显该用户名 not exists. **

```shell
#!/bin/bash

echo -n "Please input a username:"
read name
if [ id -u $name >/dev/null 2>&1 ]   #如果用户存在，id -u $name命令会返回该用户的用户ID，否则会返回一个错误
then
    m1=$(getent passwd $name | cut -d: -f7)	#getent passwd $name命令会返回该用户的密码文件条目；cut -d: -f7命令会提											   #取出该条目中的第7个字段，也就是用户的默认shell
    echo "$name's shell is $m1"
else
    echo "$name not exists."
fi
```



**3 在 exp4 目录下创建一个 shell 脚本 exercise4，要求如下：**
**(1) 判断 exp4 目录下是否存在目录 FILE4，如果存在则先删除再新建，否则新建**
**(2) 在 FILE4 目录下，新建 100 个文件，文件名依次为 file001 至 file100**
**(3) 使用 tar 命令打包并压缩这 100 个文件为 allfile.tar.gz，将该文件移动到 exp4目录下**
**(4) 查看 allfile.tar.gz 文件的权限，并将其权限修改为 user 可读可写可执行，group**
**可读，other 可读**

```shell
#!/bin/bash

if [ -d ~/exp4/FILE4 ]	#-d用来检查一个目录或文件是否存在
then
     rm -rf ~/exp4/FILE4	#-f强制删除
     mkdir ~/exp4/FILE4
else
     mkdir ~/exp4/FILE4
fi

cd ~/exp4/FILE4
touch file{001..100}
tar -czf allfile.tar.gz *		#注意gz后面有空格，czf为打包并压缩
mv -f ~/exp4/FILE4/allfile.tar.gz ~/exp4	#注意gz后面有空格
cd ~/exp4
ls -l allfile.tar.gz	#利用详细信息看其权限
chmod u+rwx allfile.tar.gz
chmod g+r-w allfile.tar.gz
chmod o+r-w allfile.tar.gz
```

