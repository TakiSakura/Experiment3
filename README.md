# 实验三 继承关系

## 实验目的

* 掌握权限访问控制修饰符的使用；
* 掌握继承的使用。

## 业务要求

1.保持实验二的代码和readme版本不变；\
2.新建代码仓库，在实验二代码的基础上完成本次实验；\
3.业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义。\
4.测试实体类分别存放于不同的package中，验证权限访问控制、继承后属性及方法的可见性

## 实验要求

* 提交源程序到gitee或github，代码仓库命名为“实验三继承关系”
* 写实验报告文件（readme.md），体现本次实验在实验二基础上的改进

## 解题思路

1. 这次实验相比较上次。新增了person类。原因是student和teacher类中，有几个共同的属性。 在person类中定义后，在学生和老师类中用extends继承 在定义构造方法的时候，用super()
   ，即可直接使用父类中的构造方法
2. 定义四个角色类，分别为教师Teacher类、学生Students类、课程Course类,还有person类。
3. 因为实验要求不同package，所以创建包时,分别创建people和SelectCourse包， 并将person、student、teacher放入people包中将course和test放入selectcourse包中
4. 其中这四个类的关系。course和peroson类与student类和teacher类的关系，person是student和teacher的父类。
   而且student和teacher会调用course类中的信息course中的信息，会写在student类中的列表里。
5. 在相同包中不同类，和不同包中不同类，还有父子类的关系中。相同包中父子类关系用extends去继承，在不同包不同子类的情况下， 属性和方法都需要加上public，并且在调用的时候，需要用到import 包名.类名，才能正确调用
6. 在子类继承父类的属性和构造方法后，需要注意的是，父类中没有的属性需要单独创建，并且super()是父类中已有的方法，没有的还需另外声明
7. 之后的内容与上次实验大致相同，重复内容不再赘述。最后输出运行结果

## 关键代码

1. 在person父类里创建构造函数

```
public Person(int number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;

    }
```

```
public Person(int number, String name, int age, String sex) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
```

2. 学生与老师的构造函数

```
public Student(int number, String name, int age, String major, String sex) {
        super(number, name, age, sex);
        this.major = major;
    }
```

```
public Teacher(int number, String name, String sex, String lesson) {
        super(number, name, sex);
        this.lesson = lesson;
    }
```

与上次不同的是，学生与老师是子类，在调用父类的属性和构造方法后，很明显，两类中的构造函数比原来要简短

2. 实例化学生与老师还有课程

```
Student friend = new Student(2020311571, "张锦程", 21, "安全工程", "MAN");
Student me = new Student(2020311593, "熊文豪", 20, "物联网", "MAN");
```

```
Teacher b = new Teacher(1, "冯媛", "WOMAN", "线性代数");
Teacher d = new Teacher(2, "魏薇", "WOMAN", "离散数学");
Teacher e = new Teacher(3, "张建军", "MAN", "机械工程基础");
```

```
Course c = new Course("线性代数", "MATH201-1", "205", 90f);
Course f = new Course("离散数学", "CST201-1", "303", 90f);
Course g = new Course("机械工程基础", "null", "3402", 90f);
```

3. 使用toString方法，将类中的信息，转化为字符串形式，方便输出

```
public String toString() {
        return "Student:   学号：" + number + "   姓名:" + name + "   年龄:" + age + "   专业:" + major + "   性别：" + sex;
    }
```

```
public String toString() {
        return "Teacher:" + "   编号：" + number + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }
```

```
public String toString() {
        return CourseName + "     课程编号：" + id + "   上课地点：" + place + "    课程时间：" + time + "min";
    }
```

4. 在学生类中创造课程列表，并定义SetCourse方法。将Course类中的信息，放到列表中

```
Course[] CourseList = new Course[2];
void setCourse(Course[] s) {
        this.CourseList = s;
    }
```

```
Course[] CourseList1 = new Course[2];
Course[] CourseList2 = new Course[2];
CourseList1[0] = c;
CourseList1[1] = g;
CourseList2[0] = c;
CourseList2[1] = f;
friend.setCourse(CourseList1);
me.setCourse(CourseList2);
```

5. 输出信息

```
System.out.println("学生" + friend.name + "所选课程:\n" + friend.CourseList[0] + "\n" + friend.CourseList[1]);
        System.out.println("学生" + me.name + "所选课程:\n" + me.CourseList[0] + "\n" + me.CourseList[1]);
```

## 运行代码截图
![截图](https://github.com/TakiSakura/Experiment2/blob/11d3f54f40b53fec1c7eb0f895502308c6052cb0/%E6%88%AA%E5%B1%8F2021-11-13%20%E4%B8%8B%E5%8D%883.52.24.png)

## 感想与体会

这次实验初步运用了继承和修饰符的使用。继承是能将父类中的属性和方法还有构造方法在子类中调用，我认为目的是能将一些多个类中重复的属性和构造方法在父类中定义， 并将这多个子类同时指向父类，这样将能节省时间，也能让代码简洁易懂\
其中修饰符的作用：
---

* private修饰符只能在相同类中使用。
* default可以被这个类本身和同一个包中的类所访问
* protected可以被这个类本身、他的子类(包括同一个包中以及不同包中的子类)和同一个包中的所有其他类访问
* public可以被所有的类访问

---
将复杂且繁多的代码，拆分成一个个类，并将不同的类存放在不同的包中。并用包括extends import进行使用。这种模块化的形式，我觉得是java相比较其他语言不同也是出色的地方
修饰符的使用很有讲究，必须完全记下修饰符的作用。才能在编写代码时不出现错误，并能以自己的想法，构建出封装性和访问权限控制的目的
