# workshop-java-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
* TC01 => สร้าง buffer ใหม่ที่ว่างเปล่า
* TC02 => สร้าง buffer ที่ใส่ค่าเข้าไปจนเต็ม
* TC03 => เมื่อเขียนค่า "A" และ "B" ควรจะอ่านได้ค่า "A" และ "B"
* TC04 => create_new_buffer_with_default_size_and_write_again_should_read_this
* TC05 => create_new_buffer_with_default_size_but_write_nine_times_should_not_full
* TC06 => create_new_buffer_with_default_size_but_write_three_times_should_not_empty