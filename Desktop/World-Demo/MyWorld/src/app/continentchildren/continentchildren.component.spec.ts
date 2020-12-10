import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContinentchildrenComponent } from './continentchildren.component';

describe('ContinentchildrenComponent', () => {
  let component: ContinentchildrenComponent;
  let fixture: ComponentFixture<ContinentchildrenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContinentchildrenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContinentchildrenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
