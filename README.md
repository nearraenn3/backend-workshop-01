# workshop-java-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ createBuffer(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

## List of test cases
* TC01 => สร้าง buffer ใหม่ที่ว่างเปล่า
* TC02 => สร้าง buffer ที่ใส่ค่าเข้าไปจนเต็ม
* TC03 => เมื่อเขียนค่า "A" และ "B" ควรจะอ่านได้ค่า "A" และ "B"
* TC04 => create_new_buffer_with_default_size_and_write_again_should_read_this
* TC05 => create_new_buffer_with_default_size_but_write_nine_times_should_not_full
* TC06 => create_new_buffer_with_default_size_but_write_three_times_should_not_empty
* TC07 => can_write_in_buffer_that_have_size_equal_to_ten_more_than_ten_times
* TC08 => create_buffer_and_identify_its_size_equal_to_15

## Refactor
* 1 => มี case เยอะ มีความซับซ้อน

## Refactor 02
* 1 => กำหนด String[] textScores = {"Love", "Fifteen", "Thirty", "Forty"}; ขึ้นมาและนำไปใช้กับกรณีต่างๆ
* 2 => แก้กรณีแต้มเสมอกันก่อน Deuce และ กรณี Deuce
* 3 => แก้ Normal case โดยลดการใช้ if ดึงค่าจากข้อ 1 มาใช้
* 4 => สลับที่เพื่อเช็คว่าถ้าเคสไหนชึ้นก่อนจะมีปัญหาไหม
* 5 => เพิ่ม condition ให้กรณี Advantage เพื่อให้ครอบคลุมทั้งหมด
* 6 => set final string to player1Name and player2Name
* 7 => Delete some condition on isDeuce because it always true


