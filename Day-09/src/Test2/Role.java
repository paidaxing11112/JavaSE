package Test2;

import java.util.Random;

/**
 * Role类用于创建和管理角色对象
 */
public class Role {
    // 角色姓名
    private String name;
    // 角色血量
    private int blood;
    // 角色性别
    private char gender;
    // 角色外貌
    private String face;

    // 男性角色外貌数组
    String[] boyfaces = {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    // 女性角色外貌数组
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    // 攻击描述数组
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    // 受伤描述数组
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    // 默认构造函数
    public Role() {}

    /**
     * 构造函数，初始化角色姓名、血量和性别
     * @param name 角色姓名
     * @param blood 角色血量
     * @param gender 角色性别
     */
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    /**
     * 获取角色性别
     * @return 角色性别
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置角色性别
     * @param gender 角色性别
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取角色外貌
     * @return 角色外貌
     */
    public String getFace() {
        return face;
    }

    /**
     * 根据角色性别设置角色外貌
     * @param gender 角色性别
     */
    public void setFace(char gender) {
        Random r = new Random();
        if(gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if(gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    /**
     * 获取角色姓名
     * @return 角色姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色姓名
     * @param name 角色姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色血量
     * @return 角色血量
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置角色血量
     * @param blood 角色血量
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 攻击其他角色
     * @param role 被攻击的角色
     */
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KongFu = attacks_desc[index];
        System.out.printf(KongFu,this.getName(), role.getName());
        System.out.println();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0],role.getName());
        }else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injureds_desc[1],role.getName());
        }else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injureds_desc[2],role.getName());
        }else if (remainBlood > 60 && remainBlood <= 70) {
            System.out.printf(injureds_desc[3],role.getName());
        }else if (remainBlood > 40 && remainBlood <= 60) {
            System.out.printf(injureds_desc[4],role.getName());
        }else if (remainBlood > 20 && remainBlood <= 40) {
            System.out.printf(injureds_desc[5],role.getName());
        }else if (remainBlood > 10 && remainBlood <= 20) {
            System.out.printf(injureds_desc[6],role.getName());
        }else  {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }

    /**
     * 显示角色信息
     */
    public void showRoleInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别:" + getGender());
        System.out.println("长相为:" + getFace());
    }
}
