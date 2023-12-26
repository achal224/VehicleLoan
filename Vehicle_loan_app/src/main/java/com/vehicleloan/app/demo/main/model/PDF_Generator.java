package com.vehicleloan.app.demo.main.model;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import javax.swing.text.Document;

import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class PDF_Generator {
	
	
	
	
	
	
	
	
//
//		public static ByteArrayOutputStream generateSanctionLetter(Document doc, ByteArrayOutputStream output, Customer loanDetails)
//		{
//			
//			String title="Apna Finance PVLT.";
//			
//			Date sanctionDate= new Date();
//			DateFormat formate=new SimpleDateFormat("dd-MM-YYYY");
//	        String date = formate.format(sanctionDate);		
//			
//			
//	    	String para="Thank you for choosing ABC Bank.Based on the application and information provided therein,we are pleased to extend an offer to you for loan as per the preliminary terms and conditions mentioned below: ";
//			
//			
//			
//			
//			
//		
//			PdfWriter.getInstance(doc, output);
//			doc.open();
//			Font Titlefont=FontFactory.getFont(FontFactory.HELVETICA_BOLD,20,CMYKColor.red);
//			Paragraph titlePara=new Paragraph(title,Titlefont);
//			titlePara.setAlignment("center");
//			doc.add(titlePara);
//			Font datFont=FontFactory.getFont(FontFactory.HELVETICA_BOLD,15);
//			
//			
//		    Paragraph  datePara = new Paragraph("Sanction on:"+date,datFont);
//		      datePara.setSpacingBefore(16);
//		    doc.add(datePara);
//		    
//		  
//		    
//		    Paragraph toPara= new Paragraph("TO:"+loanDetails.getCustomerName(),datFont);
//		    toPara.setSpacingAfter(15); 
//		    doc.add(toPara);
//		   
//		 
//			Paragraph titleParagraph=new Paragraph(para);
//			doc.add(titleParagraph);
//		    //------------------------------------Table----------------------------------------------
//		    SanctionDetails	sanction=loanDetails.getSanctionDetails();
//		    //number of column
//		    PdfPTable table=new PdfPTable(2);
//		    //-------------------------Space between---------------------------------
//		    table.setSpacingBefore(50);
//		    table.setWidthPercentage(100f);
//		    table.setWidths(new int[] {3,5});
//		    //for one row one pdfpcell object 
//		    PdfPCell cell1= new PdfPCell();
//		    cell1.setPadding(5);
//		    cell1.setPaddingLeft(20);
//		    cell1.setPhrase(new Phrase("Required Loan"));
//		    table.addCell(cell1);
//		    cell1.setPhrase(new Phrase(String.valueOf(sanction.getLoanRequired())));
//		    table.addCell(cell1);
//		    
//		    //for one row one pdfpcell object 
//		    PdfPCell cell2= new PdfPCell();
//		    cell2.setPadding(5);
//		    cell2.setPaddingLeft(20);
//		    cell2.setPhrase(new Phrase("IntrestRate"));
//		    table.addCell(cell2);
//		    cell2.setPhrase(new Phrase(String.valueOf(sanction.getIntrestRate())));
//		    table.addCell(cell2);
//		    
//		
//		  //for one row one pdfpcell object 
//		    PdfPCell cell3= new PdfPCell();
//		    cell3.setPadding(5);
//		    cell3.setPaddingLeft(20);
//		    cell3.setPhrase(new Phrase("Tenure"));
//		    table.addCell(cell3);
//		    cell3.setPhrase(new Phrase(String.valueOf(sanction.getTenure())));
//		    table.addCell(cell3);
//		    
//		    //for one row one pdfpcell object 
//		    PdfPCell cell4= new PdfPCell();
//		    cell4.setPadding(5);
//		    cell4.setPaddingLeft(20);
//		    cell4.setPhrase(new Phrase("TotalIntrest"));
//		    table.addCell(cell4);
//		    cell4.setPhrase(new Phrase(String.valueOf(sanction.getTotalIntrest())));
//		    table.addCell(cell4);
//		    
//		    //for one row one pdfpcell object 
//		    PdfPCell cell5= new PdfPCell();
//		    cell5.setPadding(5);
//		    cell5.setPaddingLeft(20);
//		    cell5.setPhrase(new Phrase("PayableAmount"));
//		    table.addCell(cell5);
//		    cell5.setPhrase(new Phrase(String.valueOf(sanction.getPayableAmount())));
//		    table.addCell(cell5);
//		    
//		    //for one row one pdfpcell object 
//		    PdfPCell cell6= new PdfPCell();
//		    cell6.setPadding(5);
//		    cell6.setPaddingLeft(20);
//		    cell6.setPhrase(new Phrase("MonthlyEmi"));
//		    table.addCell(cell6);
//		    cell6.setPhrase(new Phrase(String.valueOf(sanction.getMonthlyEmi())));
//		    table.addCell(cell6);
//		    
//		    
//		    doc.add(table);
//		    
//		    
//		    
//			doc.close();
//			//ByteArrayInputStream input=new ByteArrayInputStream(output.toByteArray());
//			return output;
//		}
//	}

}
