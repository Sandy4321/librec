/**
 * Copyright (C) 2016 LibRec
 * 
 * This file is part of LibRec.
 * LibRec is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LibRec is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LibRec. If not, see <http://www.gnu.org/licenses/>.
 */
package net.librec.job;

import java.io.IOException;

import net.librec.data.convertor.TextDataConvertor;

public class JobStatusTestCase {

	public static void main(String[] args) throws IOException {
		TextDataConvertor textDataConvertor = new TextDataConvertor("E:/workspace/hadoopworkspace/librec/data/filmtrust");;
		Thread x = new Thread(textDataConvertor);
		x.start();
		textDataConvertor.processData();;
	}

}
