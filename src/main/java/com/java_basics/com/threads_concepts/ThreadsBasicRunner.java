//There are 2ways by which we can create threads in java::
// extends Thread 
// implements Runnable


//Different states of thread::
//NEW--->Thread is ready but we are not asking it to start.
//		 Before the execution of start method, thread is in the new state.

//RUNNABLE--->When the thread is able to run, but at that point some other thread is running.
//			  the thread which is not running is called the runnable and the thread which is running is 
//			  in the runing state.

//RUNNING

//BLOCKED/WAITING---->When threads are witing for the external service to respond, 
//					  like getting the response from the database, or thread depends on another thread for its exeution
// 					  then, that state of the thread is called BLOCKED/WAITING.

//TERMINATED/DEAD--->When treads are completed, then they are in the terminated state.

/*Task 1 Kicked-Off

Task 2 Kicked-Off

Task 1 Started
101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 
Task 3 Started

Task 2 Started
131 301 302 303 201 202 132 304 203 133 134 135 136 305 306 307 308 309 310 204 205 206 207 208 209 210 211 212 213 137 138 139 140 311 312 313 314 315 316 317 214 215 216 217 218 219 220 141 142 143 318 319 320 221 144 145 146 147 148 321 322 323 222 223 224 225 226 227 228 229 149 150 151 152 153 324 325 326 327 328 329 330 230 231 154 155 156 157 158 331 332 333 334 335 336 337 338 339 340 232 233 234 235 236 237 238 239 240 159 160 161 162 163 164 165 166 341 342 343 344 345 346 347 348 349 241 242 243 244 245 246 247 248 167 168 350 351 249 250 251 252 169 170 171 172 352 353 354 355 356 357 358 359 360 361 362 363 364 365 253 254 255 256 257 173 174 175 176 177 366 367 368 369 370 371 372 373 258 259 260 261 262 178 179 180 181 182 183 184 185 374 375 376 377 378 379 380 381 263 264 265 266 267 268 269 270 186 187 188 189 190 191 192 382 383 271 272 273 274 275 276 193 194 384 385 386 387 388 389 390 391 392 277 278 279 195 196 197 198 199 
Task 1 Done
393 394 395 396 397 398 399 280 281 282 283 
Task 3 Done

Main Completed
284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 
Task 2 Done*/

//Now in order to have the priorities set in the thread, we will be using the 
// setPriority method with the values ranging from (1--->10).1--->lowest and 10 ----> highest.

//setPriority can only request the scheduler, its upto them, wether to accept or reject this means,
//setPriority may or maynot work.

//COMMUNICATION BETWEEN THE THREADS



package com.java_basics.com.threads_concepts;


//Method 1 --->Implementing Thread via extending the Thread class.
class Task1 extends Thread{
	
	public void run() {
		
		System.out.println("\nTask 1 Started");
		for(int i = 101; i <= 199; i++) {
			
			System.out.print(i + " ");
		}
		System.out.println("\nTask 1 Done");
	}
	
	
}

//Method 2 --->Implementing Thread via extending the Runnable Interface.

class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\nTask 2 Started");

		for(int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 Done");
		
	}
	
	
}

public class ThreadsBasicRunner {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		
		//TASK1
		System.out.println("\nTask 1 Kicked-Off");

		Task1 task1 = new Task1();
		task1.setPriority(6);
		task1.start();
		
		//We have not use task1.run()--->It will execute like a sync programming.
		//task1.run();
		
		
		//TASK2
		System.out.println("\nTask 2 Kicked-Off");

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		//Now we have requirement that , till task1 and task 2 is not completed, 
	    // task 3 will not start to execute.
		task1.join();
		task2Thread.join();
		
		
		//TASK3
		System.out.println("\nTask 3 Started");

		for(int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 Done");
		
		
		System.out.println("\nMain Completed");
		

	}

}
