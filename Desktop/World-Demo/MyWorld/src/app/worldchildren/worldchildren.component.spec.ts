import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorldchildrenComponent } from './worldchildren.component';

describe('WorldchildrenComponent', () => {
  let component: WorldchildrenComponent;
  let fixture: ComponentFixture<WorldchildrenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WorldchildrenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WorldchildrenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
