package com.java_basics.com.threads_concepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class GenericTask implements Runnable{
    
	private Integer number;
	
	
	GenericTask(Integer number){
		this.number = number;
		
	};
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String startResult = String.format("\nTask %s Started",Integer.toString(number));
		System.out.println(startResult);

		for(int i = number * 101; i <= number *199; i++) {
			System.out.print(i + " ");
		}
		
		String endResult = String.format("\nTask %s Done",Integer.toString(number));
		System.out.println(endResult);
		
	}
	
	
}
public class ExecutorServiceThreadsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  //This method--->newSingleThreadExecutor will runn one thread at a time.
	  //Task1 when started, it has to be finished before starting off the task2.
	  //The same can be seen in the output.
	  ExecutorService executorService = Executors.newSingleThreadExecutor();
	  executorService.execute(new GenericTask(1));
	  executorService.execute(new GenericTask(2));
	  executorService.execute(new GenericTask(3));
	  executorService.execute(new GenericTask(4));


	  
		System.out.println("\nMain Completed");
	  
	  //Output::
		/*
		 * Task 1 Started 
		 * 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115
		 * 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134
		 * 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153
		 * 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172
		 * 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191
		 * 192 193 194 195 196 197 198 199 
		 * Task 1 Done
		 * 
		 * Task 2 Started 
		 * 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215
		 * 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234
		 * 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253
		 * 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272
		 * 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291
		 * 292 293 294 295 296 297 298 299 
		 * Task 2 Done
		 */
	  

	}

}
