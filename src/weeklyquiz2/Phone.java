package weeklyquiz2;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");
            int num = Integer.parseInt(scan.next());

            if (num == 1) { // 비즈니스연락처
                BusinessContact businessContact = new BusinessContact();

                System.out.print("이름을 입력하세요: ");
                businessContact.setName(scan.nextLine());

                System.out.print("전화번호을 입력하세요: ");
                businessContact.setPhoneNumber(scan.nextLine());

                System.out.print("회사명을 입력하세요: ");
                businessContact.setCorporation(scan.nextLine());

                addressBook.addContact(businessContact);
                System.out.println();
            }
            else if(num == 2) { // 개인연락처
                PersonalContact personalContact = new PersonalContact();

                System.out.print("이름을 입력하세요: ");
                personalContact.setName(scan.nextLine());

                System.out.print("전화번호를 입력하세요: ");
                personalContact.setPhoneNumber(scan.nextLine());

                System.out.print("관계를 입력하세요: ");
                personalContact.setRelationShip(scan.nextLine());

                addressBook.addContact(personalContact);
                System.out.println();
            }
            else if(num == 3) { // 출력
                System.out.println();
                addressBook.displayContact();
            }
            else if(num == 4) { // 검색
                System.out.print("검색할 이름을 입력하세요: ");
                String name = scan.nextLine();
                String result = addressBook.searchContact(name);
                System.out.println(result);
            }
            else if(num == 5) { // 종료
                break;
            }
            else {
                System.out.println("옳지 않은 숫자입니다.");
            }
            System.out.println();

        }
    }
}