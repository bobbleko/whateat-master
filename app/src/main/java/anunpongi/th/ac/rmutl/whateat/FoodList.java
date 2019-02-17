package anunpongi.th.ac.rmutl.whateat;

import java.util.ArrayList;

public class FoodList {
    public static int selectedFoodGroup = 0;

    public static ArrayList<FoodMenu> getFoodlist(int group) {
        switch (group) {
            case 1:
                return group1();
            case 2:
                return group2();
            case 3:
                return group3();
            case 4:
                return group4();
            case 5:
                return group5();
            case 6:
                return group6();
            case 7:
                return group7();
            case 8:
                return group8();
            case 9:
                return group9();
            case 10:
                return group10();
            case 11:
                return group11();
            case 12:
                return group12();
            case 13:
                return group13();
            case 14:
                return group14();
            case 15:
                return group15();
            default:
                return group1();
        }
    }
    //อาหารจานเดียว
    private static ArrayList<FoodMenu> group1() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("ข้าวคะน้าหมูกรอบ", 570));
        list.add(new FoodMenu("ข้าวผัดหมูใส่ไข่", 660));
        list.add(new FoodMenu("ข้าวราดกระเพราไก่-ไข่ดาว", 630));
        list.add(new FoodMenu("ข้าวมันไก่", 596));
        list.add(new FoodMenu("ข้าวขาหมู", 690));
        list.add(new FoodMenu("ข้าวสตูว์ไก่", 465));
        list.add(new FoodMenu("ข้าวกุ้งทอดกระเทียมพริกไทย", 465));
        list.add(new FoodMenu("ข้าวคลุกกะปิ", 410));
        list.add(new FoodMenu("ข้าวซอยไก่,หมู", 395));
        list.add(new FoodMenu("ข้าวต้ม(ข้าวกล้อง)", 120));
        list.add(new FoodMenu("ขข้าวผัดกุนเขียง", 590));
        list.add(new FoodMenu("ข้าวผัดกุ้งใส่ไข่", 595));
        list.add(new FoodMenu("ข้าวผัดคะน้าหมูกรอบ", 670));
        list.add(new FoodMenu("ข้าวผัดต้มยำทะเลแห้ง", 400));
        list.add(new FoodMenu("ข้าวผัดปลาหึกน้ำพริกเผา", 605));
        list.add(new FoodMenu("ข้าวผัดปลาเค็ม", 405));
        list.add(new FoodMenu("ข้าวผัดปูใส่ไข่", 610));
        list.add(new FoodMenu("ข้าวผัดผักกระเฉดหมูกรอบ", 600));
        list.add(new FoodMenu("ข้าวผัดสับปะรด", 335));
        list.add(new FoodMenu("ข้าวผัดหนำเลียบ-หมู-ไข่", 370));
        list.add(new FoodMenu("ขข้าวผัดหมูน้ำพริกเผา", 665));
        list.add(new FoodMenu("ขข้าวผัดอเมริกัน", 790));
        list.add(new FoodMenu("ข้าวผัดแกงเขียวหวานไก่", 630));
        list.add(new FoodMenu("ข้าวผัดแหนม", 610));
        list.add(new FoodMenu("ข้าวผัดไส้กรอก", 520));
        list.add(new FoodMenu("ข้าวมันส้มตำ เนื้อผัดหวาน", 590));
        list.add(new FoodMenu("ข้าวมันไก่ทอด", 695));
        list.add(new FoodMenu("ข้าวยำปักษ์ใต้", 180));
        list.add(new FoodMenu("ข้าวราดหน้าไก่", 400));
        list.add(new FoodMenu("ข้าวสวย(ข้าวกล้อง)3ทัพพี", 240));
        list.add(new FoodMenu("ขข้าวสวย(ข้าวขาว)3ทัพพี", 240));
        list.add(new FoodMenu("ข้าวหน้ากุ้งผัดพริกสด", 540));
        list.add(new FoodMenu("ขข้าวหน้าเป็ด", 495));
        list.add(new FoodMenu("ขข้าวหน้าหมกไก่", 540));
        list.add(new FoodMenu("ข้าวหน้าหมูกระเทียม", 525));
        list.add(new FoodMenu("ข้าวหมูแดง", 560));
        list.add(new FoodMenu("ข้าวอบเผือก", 385));
        list.add(new FoodMenu("ข้าวเหนียวนึ่ง 1-2 ทัพพี", 80));
        list.add(new FoodMenu("ข้าวเหนียวหน้ากุ้ง 1ห่อ", 179));
        list.add(new FoodMenu("ข้าวเหนียวหมูทอด 1 ชุด", 440));
        list.add(new FoodMenu("ข้าวเหนียวหมูสวรรค์ 1 ชุด", 480));
        list.add(new FoodMenu("ข้าวแช่ 1 ชุด", 350));
        list.add(new FoodMenu("ข้าวไก่อบ", 490));
        list.add(new FoodMenu("ข้าวไข่เจียว", 445));
        list.add(new FoodMenu("แฮมเบอร์เกอร์ชีส ไก่", 280));
        list.add(new FoodMenu("แฮมเบอร์เกอร์ชีส หมู", 245));
        list.add(new FoodMenu("โจ๊กหมู", 160));
        list.add(new FoodMenu("โจ๊กหมู ตับ ไข่ลวก", 230));
        return list;
    }
    //ต้ม
    private static ArrayList<FoodMenu> group2() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("ต้มกะทิสายบัว", 225));
        list.add(new FoodMenu("ต้มข่าไก่", 210));
        list.add(new FoodMenu("ต้มจับฉ่าย", 180));
        list.add(new FoodMenu("ขต้มตือฮวน", 160));
        list.add(new FoodMenu("ต้มยำกุ้ง", 65));
        list.add(new FoodMenu("ต้มผักการดอง ซี่โครงหมู", 90));
        list.add(new FoodMenu("ต้มยำปลากระป๋อง", 55));
        list.add(new FoodMenu("ต้มยำปลากระพง", 80));
        list.add(new FoodMenu("ต้มยำเห็ดสด", 30));
        list.add(new FoodMenu("ต้มส้มปลาทู", 130));
        list.add(new FoodMenu("ต้มหัวผักกาดขาว ซี่โครงหมู", 90));
        list.add(new FoodMenu("ต้มเลือดหมู", 120));
        list.add(new FoodMenu("ต้มโคล้งปลากรอบ", 60));
        list.add(new FoodMenu("ต้มโคล้งไก่ย่าง", 115));
        list.add(new FoodMenu("ฟังตุ๋นมะนาวดอง", 125));
        list.add(new FoodMenu("หมูจุ่ม 1 ชุด", 375));
        list.add(new FoodMenu("ต้มหัวผักกาดขาว ซี่โครงหมู", 90));
        list.add(new FoodMenu("เกาเหลาลูกชิ้นน้ำใส", 225));
        list.add(new FoodMenu("เกี๊ยวน้ำกุ้ง", 275));
        list.add(new FoodMenu("ตเกี๊ยวปลาน้ำ", 165));
        list.add(new FoodMenu("เป็ดตุ๋น มะนาวดอง", 110));
        list.add(new FoodMenu("เป็นพะโล้", 110));
        list.add(new FoodMenu("ไก่ต๋นมะนาวดอง", 110));
        list.add(new FoodMenu("ไข่ต้ม น้ำปลามะนาว", 75));
        list.add(new FoodMenu("ไข่นกกระทา", 17));
        list.add(new FoodMenu("ไข่พะโล้ 1ถ้วย", 180));
        list.add(new FoodMenu("ไข่ลวก 1 ฟอง", 75));
        list.add(new FoodMenu("ไข่เค็ม 1 ฟอง", 75));

        return list;
    }
    //ผัด
    private static ArrayList<FoodMenu> group3() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("กุ้งผัดพริกอ่อน", 235));
        list.add(new FoodMenu("ปลาหมึกผัดฉ่า", 260));
        list.add(new FoodMenu("ผัดกะหล่ำปลี หมู กุ้ง", 230));
        list.add(new FoodMenu("ผัดคะน้าปลาเค็ม", 200));
        list.add(new FoodMenu("ขผัดดอกกระหล่ำกับกุ้ง", 210));
        list.add(new FoodMenu("ผัดดอกกุ่ยช่ายกับตับ", 210));
        list.add(new FoodMenu("ผัดถั่วงอกกับเต้าหู้", 155));
        list.add(new FoodMenu("ผัดถั่วลันเตากับกุ้ง", 190));
        list.add(new FoodMenu("ผัดบร้อกโคลี่กับกุ้ง", 210));
        list.add(new FoodMenu("ผัดบวบใส่ไข่", 210));
        list.add(new FoodMenu("ผัดผักกระเฉดน้ำมันหอย", 185));
        list.add(new FoodMenu("ผัดผักกาดดองใส่ไข่", 205));
        list.add(new FoodMenu("ผัดผักบุ้งไฟแดง", 210));
        list.add(new FoodMenu("ผัดผักรวมกับหมู", 210));
        list.add(new FoodMenu("ผัดพริกขิงกุ้งกับถั่วฝักยาว", 245));
        list.add(new FoodMenu("ผัดพริกแกงหมูกับหน่อไม้", 200));
        list.add(new FoodMenu("ผัดฟักทองใส่ไข่", 255));
        list.add(new FoodMenu("ผัดมะเขือยาวหมูสับ", 210));
        list.add(new FoodMenu("ผัดยอดมะระน้ำมันหอย", 185));
        list.add(new FoodMenu("ผัดวุ้นเส้นใส่ไข่", 265));
        list.add(new FoodMenu("ผัดสะตอกับหมู", 200));
        list.add(new FoodMenu("ผัดหน่อกับไข่", 200));
        list.add(new FoodMenu("ผัดหน่ไม้ฝรั่งกับกุ้ง", 230));
        list.add(new FoodMenu("ผัดเปรี้ยวหวานไก่", 215));
        list.add(new FoodMenu("ผัดเผ็ดปลาดุก", 200));
        list.add(new FoodMenu("ผัดเผ็ดปลาทอดกรอบ", 290));
        list.add(new FoodMenu("ผัดเผ็ดหมูกับมะเขือ", 250));
        list.add(new FoodMenu("ผัดไชโป๊วใส่ไข่", 125));
        list.add(new FoodMenu("หมูผัดขิง", 275));
        list.add(new FoodMenu("เครื่องในไก่ผัดขิง", 200));
        list.add(new FoodMenu("ไก่ผัดขิง", 210));
        list.add(new FoodMenu("ไข่ลูกเขย", 205));

        return list;
    }
    //แกง
    private static ArrayList<FoodMenu> group4() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("พะแนงไก่", 230));
        list.add(new FoodMenu("แกงกะหรี่หมู", 325));
        list.add(new FoodMenu("แกงขี้เหล็ก", 195));
        list.add(new FoodMenu("แกงขี้เหล็กหมูย่าง", 245));
        list.add(new FoodMenu("แกงจืดตำลึงหมูสับ", 90));
        list.add(new FoodMenu("แกงจืดถั่วงอกหมูสับ", 50));
        list.add(new FoodMenu("แกงจืดฟักยัดไส้", 90));
        list.add(new FoodMenu("แกงจืดทะระยัดไส่", 90));
        list.add(new FoodMenu("แกงจืดเต้าหู้หมูสับ", 80));
        list.add(new FoodMenu("แกงจืดไข่เจียว", 220));
        list.add(new FoodMenu("แกงป่าไก่", 130));
        list.add(new FoodMenu("แกงส้มชะอมทอดกับกุ้ง", 270));
        list.add(new FoodMenu("แกงส้มผักกะเฉก", 110));
        list.add(new FoodMenu("แกงส้มผักบุ้ง", 105));
        list.add(new FoodMenu("แกงส้มผักรวม", 120));
        list.add(new FoodMenu("แกงหมูเทโพ", 300));
        list.add(new FoodMenu("แกงเขียวหวานปลาดุก", 235));
        list.add(new FoodMenu("แกงเขียวหวานหมู", 240));
        list.add(new FoodMenu("แกงเขียวหวานไก่", 235));
        list.add(new FoodMenu("แกงเผ็ดฟักทองหมู", 250));
        list.add(new FoodMenu("แกงเผ็ดลูกชิ้น", 240));
        list.add(new FoodMenu("แกงเผ็ดเป็ดย่าง", 240));
        list.add(new FoodMenu("แกงเผ็ดไก่ใส่มะเขือ", 235));
        list.add(new FoodMenu("แกงเผ็ดไก่ใส่หน่อไม้", 245));
        list.add(new FoodMenu("แกงเลียง", 115));
        list.add(new FoodMenu("แกงเหลืองมะละกอกับกุ้ง", 80));
        list.add(new FoodMenu("แกงเหลืองหน่อไม้ดองกับปลา", 80));
        list.add(new FoodMenu("แกงไตปลา", 50));

        return list;
    }
    //ทอด
    private static ArrayList<FoodMenu> group5() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("กระทงทอด ไส้ไก่ ซอทขาว 3 ชิ้น ", 280));
        list.add(new FoodMenu("กระทงทอด ไส้ข้าวโพด", 215));
        list.add(new FoodMenu("กุนเชียงทอด 1 คู่เล็ก", 240));
        list.add(new FoodMenu("กุ้งทอดกระเทียวพริกไทย 3 ตัวกลาง", 245));
        list.add(new FoodMenu("ปลาชุบขนมปังทอด สลัดผัก", 595));
        list.add(new FoodMenu("ปลาทอดสามรส (ขนาดกลาง)", 470));
        list.add(new FoodMenu("ปลาทูทอด 1 ตัวเล็ก", 280));
        list.add(new FoodMenu("ปลาราดพริก 1 จาน", 300));
        list.add(new FoodMenu("ปลาสลิดทอด", 190));
        list.add(new FoodMenu("ปลาสำลีแดดเดียว ยำมะม่วงครึ่งตัวเล็ก", 415));
        list.add(new FoodMenu("ปลาอินทรีย์เค็มทอด", 115));
        list.add(new FoodMenu("ปลาเล็กปลาน้อยทอดกรอบ 1 ชอนโต๊ก", 80));
        list.add(new FoodMenu("ขปอเปี๊ยะทอด 2 ชิ้น", 315));
        list.add(new FoodMenu("ปอเปี๊ยะสด", 75));
        list.add(new FoodMenu("ปีกไก่สอดไส้ทอด 1 ชิ้น", 310));
        list.add(new FoodMenu("พอร์คชอปทอด ผัดผัดเนย ", 545));
        list.add(new FoodMenu("มันทอด 2 ชิ้น", 248));
        list.add(new FoodMenu("มันฝรั่งแผ่นทอด (Chip) 6 ชิ้น", 80));
        list.add(new FoodMenu("ลูกชิ้นทอด 6 ลูก", 210));
        list.add(new FoodMenu("หมูกรอบ", 560));
        list.add(new FoodMenu("หมูครุกเกร็ดขนมปังทอด ซอส 1 ชุด", 645));
        list.add(new FoodMenu("หมูทอดกระเทียมพริกไทย ", 245));
        list.add(new FoodMenu("หมูทอดเนย สลัดน้ำใส", 635));
        list.add(new FoodMenu("หมูฝอย 2 ช้อนโต๊ะ", 75));
        list.add(new FoodMenu("หมูแผ่น 1แผ่นกลาง", 125));
        list.add(new FoodMenu("หอยแมลงภู่ทอด", 605));
        list.add(new FoodMenu("เกี๊ยวกรอบ 3 ชิ้น", 235));
        list.add(new FoodMenu("เกี๊ยวกรอบราดหน้ากุ้ง", 635));
        list.add(new FoodMenu("เกี๊ยวซ่า 3 ชิ้น", 190));
        list.add(new FoodMenu("เต้าหู้ทอด 3 ชิ้น", 260));
        list.add(new FoodMenu("เนื้อเค็มทอด", 380));
        list.add(new FoodMenu("เฟรนฟรายด์ 6 ชิ้น", 220));
        list.add(new FoodMenu("แคบหมู มีมัน 5 ชิ้นเล็ก", 65));
        list.add(new FoodMenu("แคบหมูไร้มัน 5 ชิ้นเล็ก", 50));
        list.add(new FoodMenu("ไก่ทอด 1 น่อง", 345));
        list.add(new FoodMenu("ไข่ดาวทรงเครื่อง ", 250));
        list.add(new FoodMenu("ไข่ดาว 1 ฟอง", 165));
        list.add(new FoodMenu("ไข่ตุ๋น", 75));
        list.add(new FoodMenu("ไข่ยัดไส้", 310));
        list.add(new FoodMenu("ไข่เจียว", 200));
        list.add(new FoodMenu("ไข่เจียวหมูสับ", 250));
        list.add(new FoodMenu("ไส้กรอกทอด", 280));
        list.add(new FoodMenu("ไส้กรอกอีสาน", 90));
        return list;
    }
    //ย่าง
    private static ArrayList<FoodMenu> group6() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("คอหมูย่าง", 200));
        list.add(new FoodMenu("ตับไก่ปิ้ง 1 ไม้", 60));
        list.add(new FoodMenu("บาร์บีคิวซี่โครงหมู ข้าวครุกเนย  1  ชุด", 340));
        list.add(new FoodMenu("ปลาซาบะย่าง 1 ตัว", 220));
        list.add(new FoodMenu("ปลาดุกย่างน้ำปลามะนาว 1 ตัวเล็ก", 165));
        list.add(new FoodMenu("ปลาแซลมอนย่าง ", 260));
        list.add(new FoodMenu("ลูกชิ้นปิ้ง 1 ไม้", 165));
        list.add(new FoodMenu("สเต็กหมู สลัดผักสด ", 375));
        list.add(new FoodMenu("สเต็กหมู ผักสดคลุก", 505));
        list.add(new FoodMenu("สเต็กไก่ทอด มันบท", 615));
        list.add(new FoodMenu("หมูย่างเกาหลี", 375));
        list.add(new FoodMenu("หมกะทะ 1 ชุด", 375));
        list.add(new FoodMenu("หมูปิ้ง 2 ไม้", 150));
        list.add(new FoodMenu("เดนิสแฮม 1 ชิ้น", 385));
        list.add(new FoodMenu("ไก่ย่าง 1 น่อง", 165));

        return list;
    }
    //อบ
    private static ArrayList<FoodMenu> group7() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("กุ้งอบวุ้นเส้น", 300));
        list.add(new FoodMenu("ปลาช่อนอบเกลือ", 220));
        list.add(new FoodMenu("หอยแมลงภู่อบหม้อดิน 4-5 ตัว", 85));

        return list;
    }
    //นึ่ง
    private static ArrayList<FoodMenu> group8() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("กุ้งนางนึ่งนมสด", 185));
        list.add(new FoodMenu("ปลากระพงนึ่งมะนาว", 155));
        list.add(new FoodMenu("ปลาราดซอดมะนาว มันฝรั่งทอด", 560));
        list.add(new FoodMenu("ปลาหมึกนึ่งมะนาว 1 ตัว", 85));
        list.add(new FoodMenu("เต้ากู้ขาวอ่อน 1หลอด", 110));
        list.add(new FoodMenu("เต้าหู้เหลือง 1 อัน ", 90));

        return list;
    }
    //ยำ
    private static ArrayList<FoodMenu> group9() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("กระท้อนทรงเครื่อง 1 ผล", 205));
        list.add(new FoodMenu("ซุบหน่อไม้", 40));
        list.add(new FoodMenu("ยุนเชียง", 220));
        list.add(new FoodMenu("ยำถั่วพู", 185));
        list.add(new FoodMenu("ยำปลากระป๋อง", 55));
        list.add(new FoodMenu("ยำปลาดุกฟู", 275));
        list.add(new FoodMenu("ยำผักกะเฉด", 115));
        list.add(new FoodMenu("ยำรวมมิตรทะเล", 150));
        list.add(new FoodMenu("ยำวุ้นเส้น", 120));
        list.add(new FoodMenu("ยำหนังหมู", 220));
        list.add(new FoodMenu("ยำหมูย่าง", 165));
        list.add(new FoodMenu("ยำเนื้อย่าง", 165));
        list.add(new FoodMenu("ยำไข้ต้ม 1 ฝอง", 105));
        list.add(new FoodMenu("ยำไส้กรอก", 110));
        list.add(new FoodMenu("ลาบไก่", 130));
        list.add(new FoodMenu("ลาบหมู", 130));
        list.add(new FoodMenu("สลัดผัก", 240));
        list.add(new FoodMenu("สลัดเนื้อสันในทอด", 490));
        list.add(new FoodMenu("สลัดแขก", 230));
        list.add(new FoodMenu("ส้มตำปู", 35));
        list.add(new FoodMenu("ส้มตำไทย", 55));
        list.add(new FoodMenu("หมูน้ำตก", 165));
        list.add(new FoodMenu("เนื้อน้ำตก", 165));
        list.add(new FoodMenu("เมี่ยงคะน้า 3 คำ", 60));
        list.add(new FoodMenu("เมี่ยงคำ 3 คำ", 90));
        list.add(new FoodMenu("แหนมสด ข้าวทอด", 290));


        return list;
    }
    //เส้น
    private static ArrayList<FoodMenu> group10() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("เส้นเส้นใหญ่ผัดซีอิ้วหมู", 679));
        list.add(new FoodMenu("กระเพาะปลา ", 150));
        list.add(new FoodMenu("กระเพาะปลาตุ๋นน้ำแดง", 225));
        list.add(new FoodMenu("ก๋วยจ๊บ", 240));
        list.add(new FoodMenu("ก๋วยจั๊บญวณ", 235));
        list.add(new FoodMenu("ก๋วยเตี๋ยวคั่วไก่", 435));
        list.add(new FoodMenu("ก๋วยเตี๋ยวต้มยำกุ้ง", 320));
        list.add(new FoodMenu("ก๋วยเตี๋ยวกระเพราไก่", 440));
        list.add(new FoodMenu("ก๋วยเตี๋ยวผัดไทยกุ้งสดใส่ไข่", 545));
        list.add(new FoodMenu("ก๋วยเตี๋ยวราดหน้าปลากระง", 435));
        list.add(new FoodMenu("ก๋วยเตี๋ยวหลอด ", 225));
        list.add(new FoodMenu("ก๋วยเตี๋ยวเนื้อ", 370));
        list.add(new FoodMenu("ก๋วยเตียวเรือน้ำตกน้ำ", 180));
        list.add(new FoodMenu("ก๋วยเตี๋ยวเรือน้ำตกแห่ง", 225));
        list.add(new FoodMenu("ก๋วยเตี๋ยวเส้นปลา น้ำ ", 375));
        list.add(new FoodMenu("ก๋วยเตี๋ยวเส้นปลา แห้ง", 420));
        list.add(new FoodMenu("ก๋วยเตี่ยวเส้นเล็ก้มยำหมู", 335));
        list.add(new FoodMenu("ก๋วยเตี๋ยวเส้นใหญ่ผีดซีอิ้วใส่ไข่", 520));
        list.add(new FoodMenu("ก๋วยเตี๋ยวเส้นใหญ่ราดหน้าหมู", 405));
        list.add(new FoodMenu("ก๋วยเตี๋ยวแขก", 380));
        list.add(new FoodMenu("ขนมจีน 1 จับ", 50));
        list.add(new FoodMenu("ขนมจีน 2 ทัพพี", 160));
        list.add(new FoodMenu("ขนมจีนน้ำพริก", 450));
        list.add(new FoodMenu("ขนมจีนน้ำยา", 375));
        list.add(new FoodMenu("ขนมจีนน้ำเงี่ยว", 305));
        list.add(new FoodMenu("ข้าวปุ้น", 180));
        list.add(new FoodMenu("บะหมี่หรอบราดหน้า", 690));
        list.add(new FoodMenu("บะหมี่กึ่งสำเร็จรูปผัดกระเพราหมู", 540));
        list.add(new FoodMenu("บะหมี่กึ่งสำเร็จรูปผัดขี้เมา", 530));
        list.add(new FoodMenu("บะหมูน่องไก่ - น้ำ", 370));
        list.add(new FoodMenu("บะหมี่น้ำต้มยำหมู", 300));
        list.add(new FoodMenu("บะหมี่เยวหมูแดง", 305));
        list.add(new FoodMenu("บะหมีเป็ดน้ำ", 370));
        list.add(new FoodMenu("บะหมี่แห้ง หมูแดง", 345));
        list.add(new FoodMenu("ผัดไทยห่อไข่", 565));
        list.add(new FoodMenu("ผัดไทยไร้เส้น", 350));
        list.add(new FoodMenu("มักกะโรนีผัดกุ้ง", 420));
        list.add(new FoodMenu("ยากิโซบะ", 400));
        list.add(new FoodMenu("สปาเกตตี้กระเพรากุ้ง", 485));
        list.add(new FoodMenu("สปาเก็ตตี้ไก่อบ", 430));
        list.add(new FoodMenu("วุ้นเส้นผัดไทย กุ้งสด", 520));
        list.add(new FoodMenu("สุกี้ยากี้ ไก่ -น้ำ", 345));
        list.add(new FoodMenu("หมี่กรอบราดหน้าหมู", 690));
        list.add(new FoodMenu("หมี่กะทิ", 405));
        list.add(new FoodMenu("หมี่ซั่วผัด", 395));
        list.add(new FoodMenu("เฝอ", 240));
        list.add(new FoodMenu("เมี่ยงก๋วยเตี๋ยว", 60));
        list.add(new FoodMenu("เย็นตาโฟ", 290));
        list.add(new FoodMenu("เส้นจันท์ผัดปู", 575));
        list.add(new FoodMenu("เส้นหมี่ลูกชิ้นหมู", 430));
        list.add(new FoodMenu("เส้นใหญ่ผัดขี้เมา", 550));
        list.add(new FoodMenu("โกยซีหมี่", 550));

        return list;
    }
    //น้ำพริก
    private static ArrayList<FoodMenu> group11() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("น้ำพริกกะปิผักสด", 28));
        list.add(new FoodMenu("น้ำพริกกุ้งเผา", 90));
        list.add(new FoodMenu("น้ำพริกปลาป่น", 35));
        list.add(new FoodMenu("น้ำพริกมะขามเปียก", 55));
        list.add(new FoodMenu("น้ำพริกมะขามสด", 210));
        list.add(new FoodMenu("น้ำพริกมะม่วง", 100));
        list.add(new FoodMenu("น้ำพริกลงเรือ", 195));
        list.add(new FoodMenu("น้ำพริกหนุ่ม", 18));
        list.add(new FoodMenu("น้ำพริกอ่อง", 80));

        return list;
    }
    //ธัญพืช
    private static ArrayList<FoodMenu> group12() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("ข้าวโอ๊ตสุก 1 ถ้วยตวง", 130));
        list.add(new FoodMenu("ข้าวโพดต้ม 1 ฝักเล็ก", 200));
        list.add(new FoodMenu("คอร์นเฟลค 1 ถ้วยตวง\t150 \tKcal", 110));
        list.add(new FoodMenu("งาขาว 100 กรัม", 628));
        list.add(new FoodMenu("งาดำ 100 กรัม", 593));
        list.add(new FoodMenu("ถั่วดำดิบ 100 กรัม", 332));
        list.add(new FoodMenu("ถั่วลิสงดิบ 100 กรัม", 530));
        list.add(new FoodMenu("ถั่วลิสงต้ม 1 ช้อนโต๊ะ", 45));
        list.add(new FoodMenu("ถั่วลิสงแผ่นทอด 1 แผ่น", 150));
        list.add(new FoodMenu("ถั่วเขียวดิบ 100 กรัม", 329));
        list.add(new FoodMenu("ถั่วเหลืองดิบ 100 กรัม", 411));
        list.add(new FoodMenu("ถั่วแขก 100 กรัม", 366));
        list.add(new FoodMenu("ถั่วแดงดิบ 100 กรัม", 315));
        list.add(new FoodMenu("ถั่วแระต้ม 1 ช้อนโต๊ะ", 25));
        list.add(new FoodMenu("ลูกเดือย 100 กรัม", 360));
        list.add(new FoodMenu("ลูกเดือยต้มน้ำตาล 1 ถ้วย", 140));
        list.add(new FoodMenu("อัลมอนต์อบเกลือ 1 ช้อนโต๊ะ", 45));
        list.add(new FoodMenu("เมล็ดทานตะวันอบกรอบ 1 ช้อนโต๊ะ", 45));
        list.add(new FoodMenu("เมล็ดบัวนึ่ง 100 กรัม", 157));
        list.add(new FoodMenu("เมล็ดฟักทองอบกรอบ 1 ช้อนโต๊ะ", 55));
        list.add(new FoodMenu("เมล็ดแตงโมแห้ง 1 ช้อนโต๊ะ", 45));
        list.add(new FoodMenu("เม็ดขนุน 5 เม็ด", 174));
        list.add(new FoodMenu("เม็ดมะม่วงหิมพานต์ 100 กรัม", 100));
        list.add(new FoodMenu("เม็ดมะม่วงหิมพานต์อบเนย 8-10 เม็ด", 110));

        return list;
    }
    //ผลไม้
    private static ArrayList<FoodMenu> group13() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("ขกล้วยไข่", 147));
        list.add(new FoodMenu("กล้วยน้ำไทย", 124));
        list.add(new FoodMenu("กล้วยน้ำหว้า", 148));
        list.add(new FoodMenu("กล้วยหอม", 132));
        list.add(new FoodMenu("กล้วยหักมุก", 113));
        list.add(new FoodMenu("ขนุน, ละมุด", 117));
        list.add(new FoodMenu("เงาะ", 67));
        list.add(new FoodMenu("เงาะโรงเรียน", 76));
        list.add(new FoodMenu("เงาะสีชมพู", 79));
        list.add(new FoodMenu("ชมพู่แก้มแหม่ม", 16));
        list.add(new FoodMenu("ชมพู่แขกดำ", 27));
        list.add(new FoodMenu("ชมพู่นาค", 21));
        list.add(new FoodMenu("ชมพู่มะเหมี่ยว", 24));
        list.add(new FoodMenu("ชมพู่เมืองเพชร", 28));
        list.add(new FoodMenu("ชมพู่สาแหรก", 32));
        list.add(new FoodMenu("ชมพู่สีชาด", 21));
        list.add(new FoodMenu("องุ่น", 69));
        list.add(new FoodMenu("แตงไทย, สุก", 13));
        list.add(new FoodMenu("แตงโม, สุก", 25));
        list.add(new FoodMenu("ทุเรียนกระดุม", 134));
        list.add(new FoodMenu("ทุเรียนก้านยาว", 187));
        list.add(new FoodMenu("ทุเรียนชะนี", 148));
        list.add(new FoodMenu("ทุเรียนลวง", 160));
        list.add(new FoodMenu("ทุเรียนหมอนทอง", 163));
        list.add(new FoodMenu("ทุเรียน, กวน", 340));
        list.add(new FoodMenu("น้อยหน่า", 98));
        list.add(new FoodMenu("ฝรั่ง, กลมสาลี่", 43));
        list.add(new FoodMenu("พุทราไทย", 89));
        list.add(new FoodMenu("พุทรา, ลูกยาว", 120));
        list.add(new FoodMenu("พุทราแอปเปิ้ล", 50));
        list.add(new FoodMenu("แพชชั่นฟรุท, ผล, เนื้อภายนอก", 50));
        list.add(new FoodMenu("แพชชั่นฟรุท, น้ำคั้น", 60));
        list.add(new FoodMenu("แพชชั่นฟรุท, กวน(แยม)", 322));
        list.add(new FoodMenu("แพชชั่นฟรุท, ผล, เมล็ด", 294));
        list.add(new FoodMenu("มะกอกฝรั่ง", 52));
        list.add(new FoodMenu("มะขามเทศ, ชนิดมัน", 87));
        list.add(new FoodMenu("มะขามป้อม", 70));
        list.add(new FoodMenu("มะขามหวาน", 333));
        list.add(new FoodMenu("มะปรางสุก", 53));
        list.add(new FoodMenu("มะเฟือง", 37));
        list.add(new FoodMenu("มะไฟ", 48));
        list.add(new FoodMenu("มะม่วงแก้วดิบ", 76));
        list.add(new FoodMenu("มะม่วงแก้วสุก", 93));
        list.add(new FoodMenu("มะม่วงเขียวสะอาด, ดิบ", 61));
        list.add(new FoodMenu("มะม่วงเขียวเสวย, ดิบ", 87));
        list.add(new FoodMenu("มะม่วงเขียวเสวย, สุก", 82));
        list.add(new FoodMenu("มะม่วงคาราบาว, สุก", 63));
        list.add(new FoodMenu("มะม่วงทองดำ,ดิบ", 105));
        list.add(new FoodMenu("มะม่วงพราหมณ์, สุก", 49));
        list.add(new FoodMenu("มะม่วงพิมเสน, สุก", 64));
        list.add(new FoodMenu("มะม่วงพิมเสนมัน, ดิบ", 91));
        list.add(new FoodMenu("มะม่วงแรดดิบ", 51));
        list.add(new FoodMenu("มะม่วงอกร่อง, สุก", 79));
        list.add(new FoodMenu("มะม่วงหนังกลางวัน, สุก", 83));
        list.add(new FoodMenu("มะม่วงแห้วมัน, ดิบ", 73));
        list.add(new FoodMenu("มะม่วงหิมพานต์, ผล, สุก", 53));
        list.add(new FoodMenu("มะละกอ, ดิบ", 24));
        list.add(new FoodMenu("มะละกอ, สุก", 53));
        list.add(new FoodMenu("ถมะละกอ, ค่อนข้างสุก", 13));
        list.add(new FoodMenu("มะละกอ, สุก, จ.อุบลฯ", 24));
        list.add(new FoodMenu("มะพร้าวขูด", 326));
        list.add(new FoodMenu("มะพร้าวขูด, กาก", 154));
        list.add(new FoodMenu("มะพร้าวอ่อน, เนื้อ", 73));
        list.add(new FoodMenu("มังคุด", 82));
        list.add(new FoodMenu("ระกำ", 50));
        list.add(new FoodMenu("ละมุด, ไทย", 93));
        list.add(new FoodMenu("ละมุด, มะกอก", 35));
        list.add(new FoodMenu("ลางสาด", 67));
        list.add(new FoodMenu("ลำใย", 111));
        list.add(new FoodMenu("ลำใย, กะโหลก", 77));
        list.add(new FoodMenu("ลำใย, เบี้ยวเขียว", 66));
        list.add(new FoodMenu("ลิ้นจี่", 57));
        list.add(new FoodMenu("ลูกจัน, สุก", 325));
        list.add(new FoodMenu("ลูกตาล, อ่อน", 49));
        list.add(new FoodMenu("ลูกหว้า", 59));
        list.add(new FoodMenu("สละ", 74));
        list.add(new FoodMenu("ส้มเกลี้ยง", 52));
        list.add(new FoodMenu("ส้ม, เขียวหวาน", 42));
        list.add(new FoodMenu("ส้มโอ, ทองดี", 44));
        list.add(new FoodMenu("ส้มโอ, บางขุนนนท์", 52));

        return list;
    }
    //เครื่องดื่ม
    private static ArrayList<FoodMenu> group14() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("น้ำกระเจี๊ยบ", 120));
        list.add(new FoodMenu("น้ำโค้ก, น้ำเป๊ปซี่", 100));
        list.add(new FoodMenu("น้ำมะเขือเทศ", 48));
        list.add(new FoodMenu("ชาเย็นหรือชามะนาว", 100));
        list.add(new FoodMenu("น้ำมะตูม", 120));
        list.add(new FoodMenu("น้ำมะนาว", 100));
        list.add(new FoodMenu("น้ำมะพร้าว", 120));
        list.add(new FoodMenu("น้ำลำใย", 100));
        list.add(new FoodMenu("น้ำส้มคั้น", 160));
        list.add(new FoodMenu("น้ำสับปะรด", 125));
        list.add(new FoodMenu("น้ำองุ่น", 112));
        list.add(new FoodMenu("น้ำอ้อย", 240));
        list.add(new FoodMenu("รูทเบียร์", 105));
        list.add(new FoodMenu("ถโอเลี้ยง", 103));
        list.add(new FoodMenu("วอดก้า", 2));
        list.add(new FoodMenu("วิสกี้", 2));
        list.add(new FoodMenu("บรั่นดี", 2));
        list.add(new FoodMenu("นมเย็น", 425));
        list.add(new FoodMenu("น้ำขิง (ขิงผงรสหวาน)", 60));
        list.add(new FoodMenu("น้ำจับเลี้ยง", 100));
        list.add(new FoodMenu("น้ำชาเขียว (250 ml)", 70));
        list.add(new FoodMenu("น้ำชาเขียวผสมน้ำผึ้ง (250 ml)", 70));
        list.add(new FoodMenu("น้ำตาลทราย", 20));
        list.add(new FoodMenu("น้ำนมข้าวโพด ", 80));
        list.add(new FoodMenu("น้ำผลไม้รวม ", 100));
        list.add(new FoodMenu("น้ำผักรวม", 90));
        list.add(new FoodMenu("น้ำฝรั่ง 100%(200 ml) ", 100));
        list.add(new FoodMenu("กาแฟเย็น", 317));
        list.add(new FoodMenu("โกโก้เย็น", 334));
        list.add(new FoodMenu("ชาเขียว(นม)เย็น", 319));
        list.add(new FoodMenu("ชานมเย็น", 319));

        return list;
    }
    //ของหวาน
    private static ArrayList<FoodMenu> group15() {
        ArrayList<FoodMenu> list = new ArrayList<>();
        list.add(new FoodMenu("กระยาสารท", 210));
        list.add(new FoodMenu("กล้วยกลุกมะพร้าว", 100));
        list.add(new FoodMenu("กล้วยฉาบ", 200));
        list.add(new FoodMenu("กล้วต้มจิ้มมะพร้าว", 180));
        list.add(new FoodMenu("กล้วยน้ำว่าปิ้ง", 90));
        list.add(new FoodMenu("กล้วยบวชชี", 230));
        list.add(new FoodMenu("กล้วยปิ้งชุปกะทิ", 145));
        list.add(new FoodMenu("กล้วยไข่เชื่อม", 177));
        list.add(new FoodMenu("กะละแม 3 ห่อ", 195));
        list.add(new FoodMenu("กะหรี่พัฟ", 380));
        list.add(new FoodMenu("กุ่ยช่ายนึ่ง", 177));
        list.add(new FoodMenu("ขนมกรวย 3 กรวย",190 ));
        list.add(new FoodMenu("ขนมกล้วย 2 ห่อ", 240));
        list.add(new FoodMenu("ขนมขี้หนู", 165));
        list.add(new FoodMenu("ขนมครก 2 คู่",210 ));
        list.add(new FoodMenu("ขนมจีบ 3 ลูก", 120));
        list.add(new FoodMenu("ขนมชั้น 2 ชิ้น", 184));
        list.add(new FoodMenu("ขนมตาล 2 กระทง", 115));
        list.add(new FoodMenu("ขนมต้มขาว 4 ลูก", 165));
        list.add(new FoodMenu("ขนมถั่วแบบ", 432));
        list.add(new FoodMenu("ขนมถ้วย 2 ถ้วย", 265));
        list.add(new FoodMenu("ขนมน้ำดอกไม้", 190));
        list.add(new FoodMenu("ขนมบ้าบิ่น", 130));
        list.add(new FoodMenu("ขนมปลากริ่มไข่เต่า", 250));
        list.add(new FoodMenu("ขนมปังกระเทียม 2 ชิ้น", 170));
        list.add(new FoodMenu("ขนมปังขาไก่", 65));
        list.add(new FoodMenu("ขนมปังน้ำสลัดหมูหยอง", 230));
        list.add(new FoodMenu("ขนมปังปอนด์", 80));
        list.add(new FoodMenu("ขนมปังมะพร้าว", 235));
        list.add(new FoodMenu("ขนมปังสังขยา", 230));
        list.add(new FoodMenu("ขนมปังอบกรอบ 4 แผ่นเล็ก", 80));
        list.add(new FoodMenu("ขนมปังไส้กรอก", 130));
        list.add(new FoodMenu("ขนมปังไส้หมูหยอง", 185));
        list.add(new FoodMenu("ขนมปังไส้ไก่", 223));
        list.add(new FoodMenu("ถขนมฝักบัว 2 ชิ้น", 140));
        list.add(new FoodMenu("ขนมสอดไส้ 3 ห่อเล็ก", 380));
        list.add(new FoodMenu("ขนมหม้อแกง 1 ชิ้น", 179));
        list.add(new FoodMenu("ขนมเข่ง 1 กระทง", 120));
        list.add(new FoodMenu("ขนมเทียน 2 อัน", 205));
        list.add(new FoodMenu("ขนมเบื้องญวณ", 280));
        list.add(new FoodMenu("ขนมเบื้องไทยไส้หวาน", 60));
        list.add(new FoodMenu("ขนมเบื้องไทยไส้เค็ม", 50));
        list.add(new FoodMenu("ขนมเปียกปูน", 90));
        list.add(new FoodMenu("ขนมเปี๊ยะไส้ถั่ว", 300));
        list.add(new FoodMenu("ขนมไหว้พระจันทร์ไส้ทุเรียนกวน", 340));
        list.add(new FoodMenu("ขนมไหว้พระจันทร์ไส้ลูกบัว- ไข่เค็ม", 375));
        list.add(new FoodMenu("ข้าวเกรียวปากหม้อ 4 ชิ้น", 205));
        list.add(new FoodMenu("ข้าวเกรียบกุ้ง 3 แผ่น", 110));
        list.add(new FoodMenu("ข้าวเม่าทอด 2 ลูก", 418));
        list.add(new FoodMenu("ข้าวเหนียวกะทิทุเรียน", 225));
        list.add(new FoodMenu("ข้าวเหนียวดำเปียก ", 205));
        list.add(new FoodMenu("ข้าวเหนียวตัด", 210));
        list.add(new FoodMenu("ข้าวเหนียวมูลน้ำกะทิ ", 197));
        list.add(new FoodMenu("ข้าวเหนียวสังขยา", 370));
        list.add(new FoodMenu("ข้าวแต๋น", 150));
        list.add(new FoodMenu("ข้าวโพดคลุก",165 ));
        list.add(new FoodMenu("ข้าวโพดคั่ว", 60));
        list.add(new FoodMenu("ครีมโรล", 360));
        list.add(new FoodMenu("คัสตาร์ดน้ำตาลไหม้",230 ));
        list.add(new FoodMenu("คุ้กกี้ชาเขียว", 150));
        list.add(new FoodMenu("คุ้กกี้ช็อคโกแลตชิพ ",150 ));
        list.add(new FoodMenu("ถคุ้กกี้สิงคโปร์", 190));
        list.add(new FoodMenu("คุ้กกี้เนย", 210));
        list.add(new FoodMenu("คุ้กกี้ไส้สับปะรด",190 ));
        list.add(new FoodMenu("ครองแครง 22 ตัว ", 425));
        list.add(new FoodMenu("ครองแครงกะทิ", 250));
        list.add(new FoodMenu("จาวตาลเชื่อม", 190));
        list.add(new FoodMenu("ชิผผอนคัสตาร์ดเค้ก", 340));
        list.add(new FoodMenu("ช็อคโกแลต 1ชิ้นพอคำ",170 ));
        list.add(new FoodMenu("ซาลาเปาไส้หมู", 120));
        list.add(new FoodMenu("ซ่าหริ่ม", 275));
        list.add(new FoodMenu("ตะโก้แห้ว 3 กระทงเล็ก",235 ));
        list.add(new FoodMenu("ถั่วเขียวต้มน้ำตาล", 160));
        list.add(new FoodMenu("ทองม้วน 3 อันเล็ก",105 ));
        list.add(new FoodMenu("ทองหยิบ 2 ดอก", 210));
        list.add(new FoodMenu("ทับทิมกรอบ", 250));
        list.add(new FoodMenu("ขทุเรียนกระดุม", 129));
        list.add(new FoodMenu("ทุเรียนกวน", 115));
        list.add(new FoodMenu("ทุเรียนทอดกรอบ 7-8 ชิ้น", 50));
        list.add(new FoodMenu("ท็อฟฟี่นม", 20));
        list.add(new FoodMenu("บราวนี่ ", 340));
        list.add(new FoodMenu("บะจ่าง", 300));
        list.add(new FoodMenu("บัวลอย", 223));
        list.add(new FoodMenu("ถั่วลิสงแผ่นทอด 1 แผ่น", 150));
        list.add(new FoodMenu("บัวลอยน้ำขิง", 160));
        list.add(new FoodMenu("บัวลอยเผือก", 300));
        list.add(new FoodMenu("ปาท่องโก๋ 1 คู่กลาง",270 ));
        list.add(new FoodMenu("บูลเบอร์รี่ชีสเค้ก", 285));
        list.add(new FoodMenu("ป็อปคอร์น", 35));
        list.add(new FoodMenu("ฝอยทอง 1 แพ",146 ));
        list.add(new FoodMenu("พายกรอบ", 235));
        list.add(new FoodMenu("พายชีสบูลเบอร์รี่", 350));
        list.add(new FoodMenu("พายทูน่า", 280));
        list.add(new FoodMenu("พายสับปะรด", 505));
        list.add(new FoodMenu("พายเผือก", 425));
        list.add(new FoodMenu("พายไส้กรอก", 400));
        list.add(new FoodMenu("พายไส้แฮม", 400));
        list.add(new FoodMenu("พายไส้ไก่", 405));
        list.add(new FoodMenu("พิซซ่าฮาวายเอี้ยน ",345 ));
        list.add(new FoodMenu("พิซซ่าไส้กรอก", 290));
        list.add(new FoodMenu("ฟรุตสลัด", 180));
        list.add(new FoodMenu("ฟรุตเค้ก", 400));
        list.add(new FoodMenu("ฟรุ้ตบาร์", 305));
        list.add(new FoodMenu("ฟักทองนึ่งโรยมะพร้าย", 188));
        list.add(new FoodMenu("ฟักทองเชื่อม", 167));
        list.add(new FoodMenu("มะกอกทรงเครื่อง 5 ผล", 165));
        list.add(new FoodMenu("มันรังนก 2 ก้อน", 95));
        list.add(new FoodMenu("มันสำปะหลังปิ้งชุบกะทิ", 165));
        list.add(new FoodMenu("มันเทศเชื่อม", 230));
        list.add(new FoodMenu("มันแกงบวด", 184));
        list.add(new FoodMenu("มาการีน", 45));
        list.add(new FoodMenu("รวมมิตร", 230));
        list.add(new FoodMenu("ลอดช่องน้ำกะทิ",210 ));
        list.add(new FoodMenu("ลอดช่องสิงคโปร์", 215));
        list.add(new FoodMenu("ลูกชุบ 3 ชิ้น", 170));
        list.add(new FoodMenu("ลูกตาลลอยแก้ว",180 ));
        list.add(new FoodMenu("ลูกตาลอ่อน 1 1/2 ผล",60 ));
        list.add(new FoodMenu("ลูกเกต",60 ));
        list.add(new FoodMenu("วุ้นกะทิ", 215));
        list.add(new FoodMenu("วุ้นมะพร้าวอ่อน ",80 ));
        list.add(new FoodMenu("สังขยา (ทาขนมปัง)",20 ));
        list.add(new FoodMenu("สังขยสฟักทอง ", 288));
        list.add(new FoodMenu("สังขยาเผือก", 222));
        list.add(new FoodMenu("สาคูบัวลอย", 162));
        list.add(new FoodMenu("สาคูเปียกรวมมิตร", 170));
        list.add(new FoodMenu("สาคูไส้หมู", 205));
        list.add(new FoodMenu("สาเกเชื่อมราดกะทิ",235 ));
        list.add(new FoodMenu("หัวกะทิ 1 ช้อนชา", 45));
        list.add(new FoodMenu("อาลัว", 45));
        list.add(new FoodMenu("เกาลัดคั่ว",246 ));
        list.add(new FoodMenu("เต้าส่วน", 215));
        list.add(new FoodMenu("เต้าหู้นมสด", 150));
        list.add(new FoodMenu("เต้าฮวยน้ำขิง", 130));
        list.add(new FoodMenu("เผือกสอดไส้ทอด", 260));
        list.add(new FoodMenu("เผือกเชื่อม", 220));
        list.add(new FoodMenu("เยลลี่ ", 80));
        list.add(new FoodMenu("เอแคร์ไส้ครีม",225 ));
        list.add(new FoodMenu("แซนวิชแฮม ชีส",290 ));
        list.add(new FoodMenu("แซนวิชทูน่า", 180));
        list.add(new FoodMenu("แซนวิสไก่", 240));
        list.add(new FoodMenu("แมงลักน้ำกะทิ", 112));
        list.add(new FoodMenu("แบล็กฟลอเรสต์เค้ก", 470));
        list.add(new FoodMenu("แยม 1 ช้อนชา", 20));
        list.add(new FoodMenu("แยมโรล 1 ชิ้น", 310));
        list.add(new FoodMenu("โดนัท แยม น้ำตาล", 270));
        list.add(new FoodMenu("โดนัทยีสต์", 250));
        list.add(new FoodMenu("โยเกิร์ต (ธรรมชาติ)",95 ));
        list.add(new FoodMenu("โยเกิร์ต(ผลไม้)", 175));
        list.add(new FoodMenu("โยเกิร์ต (ไขมันต่ำ)", 160));
        list.add(new FoodMenu("โรตี ",590 ));
        list.add(new FoodMenu("โรตีสายไหม",145 ));
        list.add(new FoodMenu("โรตีแกงเนื้อ",675 ));
        list.add(new FoodMenu("ไข่หงส์", 174));
        list.add(new FoodMenu("ไอศครีมกะทิ 2 ก้อน ", 215));
        list.add(new FoodMenu("ไอศครีมชอกโกแล็ต  ", 110));
        list.add(new FoodMenu("ไอศครีมวนิลา 1 ก้อน", 140));
        list.add(new FoodMenu("ไอศครีมสตรอเบอรี่ 1 ก้อน", 110));

        return list;
    }

}
